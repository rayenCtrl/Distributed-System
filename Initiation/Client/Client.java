package Initiation.Client;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            addInterface addServer = (addInterface) Naming.lookup("rmi://localhost:1096/Server");
            echoInterface echoServer = (echoInterface) Naming.lookup("rmi://localhost:1096/Server");
            System.out.println("Server is ready");
            System.out.println("1 + 1 = " + addServer.add(1, 1));
            System.out.println("echo(\"Hello World\") = " + echoServer.echo("Hello World from RMI Server"));
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}
