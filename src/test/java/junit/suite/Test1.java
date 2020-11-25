package junit.suite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
    @BeforeClass
   public  static void beforeClass(){
        System.out.println("Test1 before class ");
    }

    @Before
    public void before(){
        System.out.println("Test1 before");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 class  test1");
    }

    @Test
    public void test2(){
        System.out.println("Test 1 class  test2");
    }
}
