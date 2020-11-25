package junit.order_annotation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationTest {

    @Test @Order(5) public void Q(){ System.out.println("1 test ");}
    @Test @Order(4) public void D(){ System.out.println("2 test ");}
    @Test @Order(3) public void C(){ System.out.println("3 test ");}
    @Test @Order(2) public void B(){ System.out.println("4 test"); }
    @Test @Order(1) public void A(){ System.out.println("5 test"); }






}
