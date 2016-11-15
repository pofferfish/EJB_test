package hellopackage;

import javax.ejb.*;
import java.rmi.RemoteException;

/*Factory for bean instances. Provides instance to client*/
public interface HomeInterface extends EJBHome {
    public HelloBean create() throws CreateException, RemoteException;
}