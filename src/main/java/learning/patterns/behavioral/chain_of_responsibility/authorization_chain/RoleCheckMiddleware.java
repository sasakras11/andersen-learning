package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String pass) {
       if(email.equals("admin@example.com")){
           System.out.println("hello admin!");
           return true;
       }
        System.out.println("hello user!");
        return checkNext(email,pass);
    }
}
