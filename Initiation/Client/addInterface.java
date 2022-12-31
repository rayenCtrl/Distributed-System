package Initiation.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface addInterface extends Remote {
    public int add(int a, int b) throws RemoteException;
    
}
