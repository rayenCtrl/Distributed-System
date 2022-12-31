package Toto;

import java.util.Random;

public class CounterThread extends Thread {
    private final String nom;
    private final int n;
    private final int pauseMax;
    private final Random aleatoire;

    public CounterThread(String nom, int n, int pauseMax) {
        this.nom = nom;
        this.n = n;
        this.pauseMax = pauseMax;
        this.aleatoire = new Random();
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(nom + " : " + i);
            try {
                Thread.sleep(aleatoire.nextInt(pauseMax));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nom + " a fini de compter jusqu'à " + n);
    }
}
