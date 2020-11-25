package junit.rule.external_resource;

public class Server {
   public void connect(){
        System.out.println("server connected");
    }
    public void disconnect(){
        System.out.println("server disconnected ");
    }

    public void acceptRequest(){
        System.out.println("\n-----------------------\n SERVER IS ACCEPTING REQUESTS");
    }
}
