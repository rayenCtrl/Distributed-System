package Initiation.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EchoInterface extends Remote{
    public String echo(String s) throws RemoteException;
}
