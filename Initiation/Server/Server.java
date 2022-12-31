package Initiation.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            MyServerRMI server = new MyServerRMI();
            LocateRegistry.createRegistry(1098);
            Naming.rebind("rmi://localhost:1098/Server", server);
            System.out.println("Server is ready for clients to connect");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}