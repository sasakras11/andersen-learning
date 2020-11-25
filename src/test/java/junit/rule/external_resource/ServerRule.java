package junit.rule.external_resource;

import org.junit.rules.ExternalResource;

public class ServerRule extends ExternalResource {

    private final Server server = new Server();

    @Override
    protected void before() throws Throwable {
       server.connect();
    }

    @Override
    protected void after() {
        server.disconnect();
    }

    public Server getServer(){
        return server;
    }
}
