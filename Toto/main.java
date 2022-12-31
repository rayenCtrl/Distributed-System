package Toto;

public class main {
    public static void main(String[] args) {
        /* 
        CounterThread c1 = new CounterThread("Toto", 10, 5000);
        CounterThread c2 = new CounterThread("Tata", 10, 5000);
        CounterThread c3 = new CounterThread("Titi", 10, 5000);

        c1.start();
        c2.start();
        c3.start();*/

        CounterPos c1 = new CounterPos(10);
        CounterPos c2 = new CounterPos(10);
        CounterPos c3 = new CounterPos(10);

        c1.start();
        c2.start();
        c3.start();
    }
}
