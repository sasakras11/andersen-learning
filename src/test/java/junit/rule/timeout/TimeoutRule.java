package junit.rule.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRule {

    @Rule public Timeout timeout = Timeout.millis(150);

    @Test
    public void method1()throws Exception{
        Thread.sleep(100);
    }
    @Test
    public void method2()throws Exception{
        Thread.sleep(120);
    }
    @Test
    public void method3()throws Exception{
        Thread.sleep(170);
    }
}
