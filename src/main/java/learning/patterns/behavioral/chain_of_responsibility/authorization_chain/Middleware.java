package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;

/**
 * basic chain class
 */
public abstract class Middleware {
    private Middleware next;

    public Middleware setNext(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String pass );


    protected boolean checkNext(String email, String password){
        if(next == null){
            return true;
        }

        return next.check(email,password);
    }
}
