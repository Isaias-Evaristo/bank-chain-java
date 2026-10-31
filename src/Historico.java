public class Historico {
    
    Transacao transacao;


    public void mostrarHistorico() { 

        System.out.println("=== HISTÓRICO DE TRANSAÇÕES ===");

        transacao.mostrarTransacao();
    }  
}