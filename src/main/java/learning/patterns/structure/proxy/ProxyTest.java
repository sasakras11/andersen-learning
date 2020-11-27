package learning.patterns.structure.proxy;

public class ProxyTest {
    public static void main(String[] args) {

        ProxyServer proxy = new ProxyServer("Explorers.com");

        proxy.run();
    }
}
