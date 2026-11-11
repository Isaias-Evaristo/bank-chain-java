package com.bankchain.bankchain_api;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BankController {

    private Conta conta1;
    private Conta conta2;
    private Blockchain blockchain;

    public BankController() {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Isaias Evaristo";
        cliente1.cpf = "12345678900";
        cliente1.email = "isaias@email.com";
        cliente1.telefone = "81999999999";
        cliente1.endereco = "SÃ£o Paulo, SP";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria Silva";
        cliente2.cpf = "98765432100";
        cliente2.email = "maria@email.com";
        cliente2.telefone = "81988888888";
        cliente2.endereco = "Recife, PE";

        conta1 = new Conta();
        conta1.cliente = cliente1;
        conta1.numeroConta = 1001;
        conta1.saldo = 1000.0;

        conta2 = new Conta();
        conta2.cliente = cliente2;
        conta2.numeroConta = 1002;
        conta2.saldo = 500.0;

        Transacao tInicial = new Transacao();
        tInicial.tipo = "DepÃ³sito";
        tInicial.valor = 1000.0;
        tInicial.data = "11/11/2026";
        tInicial.hora = "10:00";
        tInicial.descricao = "Aporte inicial de abertura de conta";
        conta1.historico.adicionarTransacao(tInicial);

        blockchain = new Blockchain(conta1.historico.transacao);
    }

    @GetMapping("/contas")
    public Map<String, Object> getContas() {
        Map<String, Object> dados = new HashMap<>();
        
        Map<String, Object> c1 = new HashMap<>();
        c1.put("nome", conta1.cliente.nome);
        c1.put("numeroConta", conta1.numeroConta);
        c1.put("saldo", conta1.saldo);

        Map<String, Object> c2 = new HashMap<>();
        c2.put("nome", conta2.cliente.nome);
        c2.put("numeroConta", conta2.numeroConta);
        c2.put("saldo", conta2.saldo);

        dados.put("conta1", c1);
        dados.put("conta2", c2);
        return dados;
    }

    @GetMapping("/historico")
    public Map<String, Object> getHistorico() {
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("conta1", conta1.historico.transacao);
        resposta.put("conta2", conta2.historico.transacao);
        return resposta;
    }

    @GetMapping("/blockchain")
    public ArrayList<Bloco> getBlockchain() {
        return blockchain.cadeia;
    }

    @GetMapping("/validar")
    public Map<String, Object> validarLedger() {
        boolean integro = true;
        for (int i = 1; i < blockchain.cadeia.size(); i++) {
            Bloco atual = blockchain.cadeia.get(i);
            Bloco anterior = blockchain.cadeia.get(i - 1);

            if (!atual.hashAnterior.equals(anterior.hash)) {
                integro = false;
                break;
            }
        }

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("valido", integro);
        resultado.put("totalBlocos", blockchain.cadeia.size());
        resultado.put("mensagem", integro ? "Ledger 100% Ã­ntegro. Todos os blocos estÃ£o vÃ¡lidos e encadeados!" : "Alerta de fraude! Encadeamento violado.");
        return resultado;
    }

    @PostMapping("/transferir")
    public Map<String, Object> transferir(@RequestBody Map<String, Object> dados) {
        int origem = Integer.parseInt(dados.get("origem").toString());
        double valor = Double.parseDouble(dados.get("valor").toString());
        String descricao = dados.getOrDefault("descricao", "TransferÃªncia BankChain").toString();

        Map<String, Object> resposta = new HashMap<>();

        Conta cOrigem = (origem == 1001) ? conta1 : conta2;
        Conta cDestino = (origem == 1001) ? conta2 : conta1;

        if (cOrigem.saldo < valor) {
            resposta.put("sucesso", false);
            resposta.put("mensagem", "Saldo insuficiente para realizar a transferÃªncia.");
            return resposta;
        }

        cOrigem.transferir(cDestino, valor);

        Transacao tSaida = new Transacao();
        tSaida.tipo = "TRANSFERENCIA ENVIADA";
        tSaida.valor = valor;
        tSaida.data = "11/11/2026";
        tSaida.hora = "15:00";
        tSaida.descricao = descricao;
        cOrigem.historico.adicionarTransacao(tSaida);

        Transacao tEntrada = new Transacao();
        tEntrada.tipo = "TRANSFERENCIA RECEBIDA";
        tEntrada.valor = valor;
        tEntrada.data = "11/11/2026";
        tEntrada.hora = "15:00";
        tEntrada.descricao = descricao;
        cDestino.historico.adicionarTransacao(tEntrada);

        ArrayList<Transacao> loteBloco = new ArrayList<>();
        loteBloco.add(tSaida);
        blockchain.adicionarBloco(loteBloco);

        resposta.put("sucesso", true);
        resposta.put("mensagem", "TransferÃªncia realizada com sucesso e novo Bloco lacrado!");
        resposta.put("novoBlocoIndice", blockchain.getUltimoBloco().indice);
        resposta.put("novoBlocoHash", blockchain.getUltimoBloco().hash);
        return resposta;
    }
}