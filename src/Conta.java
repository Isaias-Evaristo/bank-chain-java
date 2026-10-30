public class Conta {
 
    String titular;
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


    public void mostrarSaldo() {
    System.out.println("Saldo Atual: R$ " + saldo);
        }

  }
