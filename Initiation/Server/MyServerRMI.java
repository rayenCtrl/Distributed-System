package Initiation.Server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MyServerRMI extends UnicastRemoteObject implements EchoInterface, SumInterface {
    public MyServerRMI() throws RemoteException {
        super();
    }
    
    public String echo(String s) throws RemoteException {
        return s;
    }
    
    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }
}