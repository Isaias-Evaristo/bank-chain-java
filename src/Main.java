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


        System.out.println("=== CONTA 1 ===");
        conta1.mostrarSaldo();

        System.out.println();

        System.out.println("=== CONTA 2 ===");
        conta2.mostrarSaldo();

        Transacao transacao = new Transacao();

        transacao.tipo = "TRANSFERENCIA";
        transacao.valor = 300;
        transacao.data = "31/10/2026";
        transacao.hora = "16:30";
        transacao.descricao = "Transferencia de Isaias para Maria";
    

       System.out.println();

        Transacao transacao1 = new Transacao();
        transacao1.tipo = "Depósito";
        transacao1.valor = 1000;
        transacao1.data = "2023-06-01";
        transacao1.hora = "10:00";
        transacao1.descricao = "Depósito em dinheiro";

        System.out.println("=== TRANSAÇÃO 1 ===");
        transacao1.mostrarTransacao();

        System.out.println();

        Transacao transacao2 = new Transacao();
        transacao2.tipo = "Saque";
        transacao2.valor = 500;
        transacao2.data = "2023-06-02";
        transacao2.hora = "14:30";
        transacao2.descricao = "Saque em caixa eletrônico";

        System.out.println("=== TRANSAÇÃO 2 ===");
        transacao2.mostrarTransacao();

        System.out.println();

       System.out.println("=== COMPROVANTE DE TRANSAÇÃO ===");

        transacao.tipo = "TRANSFERENCIA";
        transacao.valor = 300;
        transacao.data = "30/10/2026";
        transacao.hora = "16:30";
        transacao.descricao = "Transferencia de Isaias para Maria";

       transacao.mostrarTransacao();


     Historico historico = new Historico();

         historico.adicionarTransacao(transacao);
        
         System.out.println();

         historico.mostrarHistorico();


          conta1.historico.adicionarTransacao(transacao1);

       
          conta1.mostrarExtrato();
       
                System.out.println();
        System.out.println(">>> REGISTRO DO BLOCO GÊNESIS NO LEDGER (LIVRO-RAZÃO) IMUTÁVEL <<<");

        
        Bloco blocoGenesis = new Bloco(0, conta1.historico.transacao, "0");

        
        blocoGenesis.mostrarBloco();
    }
}      
       
