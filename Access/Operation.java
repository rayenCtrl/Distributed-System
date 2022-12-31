package Access;

import java.util.concurrent.locks.ReentrantLock;

public class Operation extends Thread {
    private Compte compte;

    public Operation(String nom, Compte compte) {
        super(nom);
        this.compte = compte;
    }

    public void run() {
        while (true) {
            int i = (int) (Math.random() * 10000);
            String nom = getName();
            System.out.print(nom);

            compte.verrou.lock();
            try {
                // Effectuer deux opérations qui devraient laisser le solde du compte à 0
                compte.ajouter(i);
                compte.retirer(i);
            } finally {
                compte.verrou.unlock();
            }

            int solde = compte.getSolde();
            System.out.print(nom);
            if (solde != 0) {
                System.out.println(nom + ":**solde=" + solde);
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Compte compte = new Compte();
        for (int i = 0; i < 20; i++) {
            Operation operation = new Operation("" + (char)('A' + i), compte);
            operation.start();
        }
    }
}