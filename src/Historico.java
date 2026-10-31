import java.util.ArrayList;

public class Historico {

    // Futuramente o Historico armazenará múltiplas transações.

    ArrayList<Transacao> transacao = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        this.transacao.add(transacao);
    }

    public void mostrarHistorico() {

        System.out.println("=== HISTÓRICO DE TRANSAÇÕES ===");

        for (Transacao transacao : this.transacao) {
            transacao.mostrarTransacao();
        }

    }
}