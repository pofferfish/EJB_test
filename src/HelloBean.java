import javax.ejb.*;

public class HelloBean implements SessionBean {


    @Override
    public void setSessionContext(SessionContext sessionContext) {
        System.out.println("session context");
    }

    @Override
    public void ejbRemove() {
        System.out.println("ejb remove");
    }

    @Override
    public void ejbActivate() {
        System.out.println("ejb activate");
    }

    @Override
    public void ejbPassivate() {
        System.out.println("ejb passivate");
    }

    public String hello() {
        return "Hello World!";
    }
}
