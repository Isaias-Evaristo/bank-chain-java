import java.util.ArrayList;

public class Blockchain {

    ArrayList<Bloco> cadeia = new ArrayList<>();

    
    public Blockchain(ArrayList<Transacao> transacoesIniciais) {
        Bloco genesis = new Bloco(0, transacoesIniciais, "0");
        cadeia.add(genesis);
    }

    
    public Bloco getUltimoBloco() {
        return cadeia.get(cadeia.size() - 1);
    }

    
    public void adicionarBloco(ArrayList<Transacao> novasTransacoes) {
        Bloco ultimoBloco = getUltimoBloco();
        int novoIndice = ultimoBloco.indice + 1;
        String hashAnterior = ultimoBloco.hash;

        Bloco novoBloco = new Bloco(novoIndice, novasTransacoes, hashAnterior);
        cadeia.add(novoBloco);
    }

    
    public void mostrarBlockchain() {
        System.out.println("==================================================");
        System.out.println("            LEDGER IMUTÁVEL (BANKCHAIN)           ");
        System.out.println("==================================================");
        
        for (Bloco bloco : cadeia) {
            bloco.mostrarBloco();
            System.out.println();
        }
    }
}