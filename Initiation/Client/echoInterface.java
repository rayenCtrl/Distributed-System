package Initiation.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface echoInterface extends Remote{
    public String echo(String s) throws RemoteException;
}
