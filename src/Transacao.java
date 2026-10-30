public class Transacao {
     String tipo;
     double valor;
     String data;
     String hora;
     String descricao;


public void mostrarTransacao() {

    System.out.println("Tipo: " + tipo);
    System.out.println("Valor: " + valor);
    System.out.println("Data: " + data);
    System.out.println("Hora: " + hora);
    System.out.println("Descrição: " + descricao);
   
   }

}
