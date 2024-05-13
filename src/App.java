import Main.Main;

public class App {
  public static void main(String[] args) throws Exception {
    Main mn0 = new Main("#0");
    Main mn1 = new Main("#1");
    Main mn2 = new Main("#2");
    Main mn3 = new Main("#3");
    Main mn4 = new Main("#4");
    Main mn5 = new Main("#5");
    Main mn6 = new Main("#6");
    Main mn7 = new Main("#7");
    Main mn8 = new Main("#8");
    Main mn9 = new Main("#9");
    Main mn10 = new Main("#10");
    Main mn11 = new Main("#11");
    /* Cria 12 objetos da classe Main */

    try {
      mn0.thrd.join();
      System.out.println(mn0.getName() + " terminou em aproximadamente " + mn0.getTempoGasto() + " minutos");

      mn1.thrd.join();
      System.out.println(mn1.getName() + " terminou em aproximadamente " + mn1.getTempoGasto() + " minutos");

      mn2.thrd.join();
      System.out.println(mn2.getName() + " terminou em aproximadamente " + mn2.getTempoGasto() + " minutos");

      mn3.thrd.join();
      System.out.println(mn3.getName() + " terminou em aproximadamente " + mn3.getTempoGasto() + " minutos");

      mn4.thrd.join();
      System.out.println(mn4.getName() + " terminou em aproximadamente " + mn4.getTempoGasto() + " minutos");

      mn5.thrd.join();
      System.out.println(mn5.getName() + " terminou em aproximadamente " + mn5.getTempoGasto() + " minutos");

      mn6.thrd.join();
      System.out.println(mn6.getName() + " terminou em aproximadamente " + mn6.getTempoGasto() + " minutos");

      mn7.thrd.join();
      System.out.println(mn7.getName() + " terminou em aproximadamente " + mn7.getTempoGasto() + " minutos");

      mn8.thrd.join();
      System.out.println(mn8.getName() + " terminou em aproximadamente " + mn8.getTempoGasto() + " minutos");

      mn9.thrd.join();
      System.out.println(mn9.getName() + " terminou em aproximadamente " + mn9.getTempoGasto() + " minutos");

      mn10.thrd.join();
      System.out.println(mn10.getName() + " terminou em aproximadamente " + mn10.getTempoGasto() + " minutos");

      mn11.thrd.join();
      System.out.println(mn11.getName() + " terminou em aproximadamente " + mn11.getTempoGasto() + " minutos");
      /* Espera as execuções terminarem para mostrar no console o tempo gasto */

    } catch (Exception e) {
      System.out.println("Codigo interrompido");
    }
    System.out.println("Fim do codigo");
  }
}
