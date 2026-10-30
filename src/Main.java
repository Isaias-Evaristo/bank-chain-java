public class Main {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta();

        conta1.titular = "Isaias";
        conta1.numeroConta = 1001;
        conta1.saldo = 1000;

 
        conta1.depositar(500);        

        conta1.sacar(3000);
    
        conta1.mostrarSaldo();
    }
}