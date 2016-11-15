import Hello.hellopackage.HelloBean;
import Hello.hellopackage.HomeInterface;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class Client {
    public static void main(String[] args) {
        new Client().go();
    }

    public void go() {
        try {
            Context ic = new InitialContext();
            Object o = ic.lookup("HelloBean");
            HomeInterface home = (HomeInterface) PortableRemoteObject.narrow(o, HomeInterface.class);

            HelloBean hello = home.create();
            System.out.println(hello.hello());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
