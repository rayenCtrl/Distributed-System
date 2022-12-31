package Toto;

import java.util.concurrent.TimeUnit;

public class CounterPos extends Thread {
    private int max;
    private int pos;
    private static int cpt = 0;

    public CounterPos(int max) {
        this.max = max;
        this.pos = ++cpt;
    }

    public void run() {
        for (int i = 1; i <= max; i++) {
            System.out.println("Thread " + pos + " : " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + pos + " a fini de compter jusqu'à " + max);
    }
}
