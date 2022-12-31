package Initiation.Server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ServerImplement extends UnicastRemoteObject implements addInterface, echoInterface {

    public ServerImplement() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public String echo(String s) throws RemoteException {
        return s;
    }
}