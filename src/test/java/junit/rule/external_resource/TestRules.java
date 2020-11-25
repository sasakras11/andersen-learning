package junit.rule.external_resource;


import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class TestRules extends ExternalResource {

    public static final Server server = new Server();

    @ClassRule public static final ExternalResource resource = new ExternalResource() {

        @Override
        protected void before() throws Throwable {
            server.connect();
        }

        @Override
        protected void after() {
            server.disconnect();
        }
    };


    @Test public void testMethodOne() {
        System.out.println("testing server");
        server.acceptRequest();
    }

    @Test public void testMethodTwo() {
        System.out.println("testing server ");
        server.acceptRequest();
    }
}
