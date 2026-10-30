public class Conta {
 
    Cliente cliente;
    int numeroConta;
    double saldo;


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
            System.out.println("Saldo insuficiente para transferência");
        }
     }

    public void mostrarSaldo() {
    System.out.println("Cliente: " + cliente.nome);
    System.out.println("Conta: " + numeroConta); 
    System.out.println("Saldo Atual: R$ " + saldo);
        }

  }
