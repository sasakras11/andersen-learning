package learning.patterns.structure.proxy;

public class Server {

       private String url;

    public Server(String url) {
        this.url = url;
        load();
    }

    public void load(){
           System.out.println("server is started");
       }

       public void applyRequests(){
           System.out.println("server is ready to listen requests");
       }


}
