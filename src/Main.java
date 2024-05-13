public class Main extends Thread {
    public Thread thrd;
    long tempoGasto;

    public Main(String name) {
        thrd = new Thread(this, name);
        thrd.start();
        /* Assim que a classe é instanciada ela inicia sua execução */
    }

    public void run() {
        long tempoInicio = System.currentTimeMillis();
        for (long i = 0; i < 5000000000l; i++) {
            for (long j = 0; j < 50; j++);
        };
        long tempoFim = System.currentTimeMillis();
        this.tempoGasto = (tempoFim - tempoInicio) / 60000;
    }

    public long getTempoGasto() {
        return this.tempoGasto;
    }

}