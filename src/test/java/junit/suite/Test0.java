package junit.suite;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class Test0 {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before All");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @Test()
    public void test1(){
        System.out.println("Test 0 class  test1");
    }

    @Test
    public void test2(){
        System.out.println("Test 0 class  test2");
    }
}
