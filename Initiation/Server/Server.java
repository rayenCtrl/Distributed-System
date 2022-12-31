package Initiation.Server;

public class Server {
    public static void main(String[] args) {
        try {
            ServerImplement server = new ServerImplement();
            java.rmi.Naming.rebind("rmi://localhost:1096/Server", server);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}