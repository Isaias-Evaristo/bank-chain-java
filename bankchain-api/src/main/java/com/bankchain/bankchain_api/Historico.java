package com.bankchain.bankchain_api;

import java.util.ArrayList;

public class Historico {


    ArrayList<Transacao> transacao = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        this.transacao.add(transacao);
    }

    public void mostrarHistorico() {

        System.out.println("=== HISTÃƒâ€œRICO DE TRANSAÃƒâ€¡Ãƒâ€¢ES ===");

        for (Transacao transacao : this.transacao) {
            transacao.mostrarTransacao();
        }

    }
}