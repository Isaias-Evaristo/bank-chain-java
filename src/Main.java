import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Isaias";
        cliente1.cpf = "12345678900";
        cliente1.email = "isaias@email.com";
        cliente1.telefone = "81999999999";
        cliente1.endereco = "São Paulo, SP";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        cliente2.cpf = "98765432100";
        cliente2.email = "maria@email.com";
        cliente2.telefone = "81988888888";
        cliente2.endereco = "Recife, PE";

       
        Conta conta1 = new Conta();
        conta1.cliente = cliente1;
        conta1.numeroConta = 1001;
        conta1.saldo = 1000;

        Conta conta2 = new Conta();
        conta2.cliente = cliente2;
        conta2.numeroConta = 1002;
        conta2.saldo = 500;

        conta1.transferir(conta2, 300);

        System.out.println("=== SALDO CONTA 1 ===");
        conta1.mostrarSaldo();

        System.out.println();

        System.out.println("=== SALDO CONTA 2 ===");
        conta2.mostrarSaldo();

        
        Transacao transacao1 = new Transacao();
        transacao1.tipo = "Depósito";
        transacao1.valor = 1000;
        transacao1.data = "2023-06-01";
        transacao1.hora = "10:00";
        transacao1.descricao = "Depósito inicial em dinheiro";

        Transacao transacao2 = new Transacao();
        transacao2.tipo = "Saque";
        transacao2.valor = 500;
        transacao2.data = "2023-06-02";
        transacao2.hora = "14:30";
        transacao2.descricao = "Saque em caixa eletrônico";

        Transacao transacaoTransferencia = new Transacao();
        transacaoTransferencia.tipo = "TRANSFERENCIA ENVIADA";
        transacaoTransferencia.valor = 300;
        transacaoTransferencia.data = "30/10/2026";
        transacaoTransferencia.hora = "16:30";
        transacaoTransferencia.descricao = "Transferencia de Isaias para Maria";

        System.out.println();
        System.out.println("=== COMPROVANTE DE TRANSFERÊNCIA ===");
        transacaoTransferencia.mostrarTransacao();

        
        conta1.historico.adicionarTransacao(transacao1);
        conta1.historico.adicionarTransacao(transacaoTransferencia);
        
        System.out.println();
        conta1.mostrarExtrato();

        
        Transacao transacaoMaria = new Transacao();
        transacaoMaria.tipo = "TRANSFERENCIA RECEBIDA";
        transacaoMaria.valor = 300;
        transacaoMaria.data = "30/10/2026";
        transacaoMaria.hora = "16:30";
        transacaoMaria.descricao = "Transferencia recebida de Isaias";

        conta2.historico.adicionarTransacao(transacaoMaria);
        
        System.out.println();
        conta2.mostrarExtrato();

        
        System.out.println();
        System.out.println(">>> REGISTRO NO LEDGER (LIVRO-RAZÃO) IMUTÁVEL <<<");

        
        Blockchain bankChain = new Blockchain(conta1.historico.transacao);

        
        bankChain.adicionarBloco(conta2.historico.transacao);

        
        bankChain.mostrarBlockchain();
    }
}