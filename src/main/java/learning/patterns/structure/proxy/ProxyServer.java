package learning.patterns.structure.proxy;

public class ProxyServer {
    private final String url;
    private Server server;

    public ProxyServer(String url) {
        this.url = url;
    }


    public void run(){
        if(server == null){
            server = new Server(url);
            server.applyRequests();
        }
    }
}
