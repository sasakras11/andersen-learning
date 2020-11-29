package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;


import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;


    /**
     * here user sets chain
     * @param middleware
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email,String pass){
        if(middleware.check(email,pass)){
            System.out.println("Authorization have been successful!");

            /**
             *  if user is successful authorized then do something
             */
            return true;
        }
        return false;
    }
    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }



}
