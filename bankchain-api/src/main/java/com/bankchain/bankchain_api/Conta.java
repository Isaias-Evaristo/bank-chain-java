package com.bankchain.bankchain_api;

public class Conta {
 
    Cliente cliente;
    int numeroConta;
    double saldo;
    Historico historico = new Historico();

    public void depositar (double valor) {

        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void sacar (double valor){

      if (saldo >= valor) {
        saldo = saldo - valor; 
     
        } else {
            System.out.println("saldo insuficiente para saque");
        }
     }

     public void transferir(Conta destino, double valor) {
        
        if (saldo >= valor) {

            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
        } else {
            System.out.println("Saldo insuficiente para transferÃƒÂªncia");
        }
     }

    public void mostrarSaldo() {
    System.out.println("Cliente: " + cliente.nome);
    System.out.println("Conta: " + numeroConta); 
    System.out.println("Saldo Atual: R$ " + saldo);
        }

        public void mostrarExtrato() {
    System.out.println("=================================");
    System.out.println("        EXTRATO BANCÃƒÂRIO         ");
    System.out.println("=================================");
    System.out.println("Cliente: " + cliente.nome);
    System.out.println("Conta: " + numeroConta);
    System.out.println();

    historico.mostrarHistorico();

    System.out.println("Saldo Atual: R$ " + saldo);
    System.out.println("=================================");
}
  }
