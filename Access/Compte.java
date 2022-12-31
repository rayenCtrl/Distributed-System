package Access;

import java.util.concurrent.locks.ReentrantLock;

public class Compte {
    private int solde = 0;
    public ReentrantLock verrou = new ReentrantLock();

    public void ajouter(int somme) {
        verrou.lock();
        try {
            solde += somme;
            System.out.print(" ajoute " + somme);
        } finally {
            verrou.unlock();
        }
    }

    public void retirer(int somme) {
        verrou.lock();
        try {
            solde -= somme;
            System.out.print(" retire " + somme);
        } finally {
            verrou.unlock();
        }
    }

    public void operationNulle(int somme) {
        verrou.lock();
        try {
            solde += somme;
            System.out.print(" ajoute " + somme);
            solde -= somme;
            System.out.print(" retire " + somme);
        } finally {
            verrou.unlock();
        }
    }

    public int getSolde() {
        verrou.lock();
        try {
            return solde;
        } finally {
            verrou.unlock();
        }
    }
}
/*
 * Pour résoudre le problème d'opérations concurrentes sur le compte bancaire en utilisant Java, 
 * vous pouvez utiliser la classe java.util.concurrent.locks.ReentrantLock qui permet de verrouiller 
 * l'accès à une ressource de manière à ce qu'un seul thread à la fois puisse y accéder
 * Pour utiliser le verrou, vous appelez la méthode lock avant d'accéder à la ressource 
 * (ici, le solde du compte bancaire) et la méthode unlock lorsque vous avez fini d'accéder à la ressource. 
 * Vous devez également utiliser un bloc try-finally pour vous assurer que le verrou sera toujours déverrouillé, 
 * même si une exception est levée pendant l'accès à la ressource.
 */
// translate the comments into English and add your own comments to the code below this line 







