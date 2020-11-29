package learning.patterns.behavioral.chain_of_responsibility.authorization_chain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChainTest {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;


    private static void init(){
        server = new Server();
        server.register("admin@gmail.com","admin");
        server.register("user@gmail.com","user");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.setNext(new UserExistsMiddleware(server)).setNext(new RoleCheckMiddleware());


        server.setMiddleware(middleware);
    }
    public static void main(String[] args)throws Throwable {
        init();

        boolean success;
        do{
            System.out.println("enter email");
            String email = reader.readLine();
            System.out.println("enter pass");
            String pass = reader.readLine();
            success = server.logIn(email,pass);

        }while (!success);

    }
}
