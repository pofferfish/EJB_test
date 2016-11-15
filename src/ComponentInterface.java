import javax.ejb.*;
import java.rmi.RemoteException;

/* Declare business methods */
public interface ComponentInterface extends EJBObject {
    public String hello() throws RemoteException;
}