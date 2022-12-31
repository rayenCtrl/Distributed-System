package Initiation.Client;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class MyClientRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1098);
            EchoInterface objetEcho = (EchoInterface) registry.lookup("rmi://localhost:1098/server");
            SumInterface objetSum = (SumInterface) registry.lookup("rmi://localhost:1098/server");

            System.out.println("Echo: " + objetEcho.echo("Hello World from RMI server"));
            System.out.println("Sum: " + objetSum.sum(5, 10));
    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
