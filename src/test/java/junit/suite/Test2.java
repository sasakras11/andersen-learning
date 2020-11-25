package junit.suite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test2 before class ");
    }

    @Before
    public void before(){
        System.out.println("Test2 before");
    }

    @Test
    public void test1(){
        System.out.println("Test 2 class  test1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 class  test2");
    }
}
