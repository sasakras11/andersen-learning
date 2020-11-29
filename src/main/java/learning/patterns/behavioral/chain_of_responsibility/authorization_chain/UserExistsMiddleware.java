package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;

public class UserExistsMiddleware extends Middleware{
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }


    @Override
    public boolean check(String email, String pass) {
        if(!server.hasEmail(email)){
            System.out.println("this email is not registered!");
            return false;
        }
        if(!server.isValidPassword(email,pass)){
            System.out.println("wrong password");
            return false;

        }
        return checkNext(email,pass);

    }
}
