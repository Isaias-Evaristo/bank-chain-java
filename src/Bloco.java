import java.util.ArrayList;

public class Bloco {

    int indice;
    long timestamp;
    ArrayList<Transacao> transacoes;
    String hashAnterior;
    String hash;

    
    public Bloco(int indice, ArrayList<Transacao> transacoes, String hashAnterior) {
        this.indice = indice;
        this.transacoes = transacoes;
        this.hashAnterior = hashAnterior;
        this.timestamp = System.currentTimeMillis(); 
        this.hash = calcularHash();                  
    }

    
    public String calcularHash() {
        String dadosParaMisturar = indice + Long.toString(timestamp) + hashAnterior + transacoes.toString();
        return Integer.toHexString(dadosParaMisturar.hashCode());
    }

         
    
      public void mostrarBloco() {
        System.out.println("=================================");
        System.out.println("            BLOCO #" + indice);
        System.out.println("=================================");
        System.out.println("Data/Hora (ms): " + timestamp);
        System.out.println("Hash Anterior:  " + hashAnterior);
        System.out.println("Hash do Bloco:  " + hash);
        System.out.println("Qtd Transações: " + transacoes.size());
        System.out.println("=================================");
      }

}     