package Initiation.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumInterface extends Remote {
    public int sum(int a, int b) throws RemoteException;
}
