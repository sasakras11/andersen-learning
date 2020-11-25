package junit.rule.exception;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionHandlingTest {


    ClassUnderTest classUnderTest = new ClassUnderTest();


     @Rule
     public ExpectedException thrown = ExpectedException.none();

    @Test
    public void showCaseExceptionRule(){
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage("ArrayIndexOutOfBoundException");

        classUnderTest.throwsArrayIndexOutOfBoundException();

    }

    /**
     * тут ми можемо зловити помилку і подивится інформацію про неї - цей метод кращий
     * за ловлю по @Test(expected - )
     */
    @Test
    public void TryCatchExceptionHandling() {
        try {
            classUnderTest.throwsArrayIndexOutOfBoundException();
            fail("expected an ArrayIndexOutOfBoundException to be thrown");
        } catch (Exception e) {
             assertThat(e.getMessage(), CoreMatchers.containsString("ArrayIndexOutOfBoundException"));
        }
    }

    /**
     * проблема -
     * 1.) якщо наприклад ми визиваємо 2 методи - один з ексепшинои а другий робить
     * якусь логіку і кидає ексепш - то тест зупиниться на першій помилці і ми не получимо логіку яка
     * йде після помилки
     * 2.) ми не можемо подивитися інформацію про помилку
     *
     * @throws Exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethod() throws Exception {

        classUnderTest.printFirstBookTittle();
        classUnderTest.throwsArrayIndexOutOfBoundException();
    }

    public static class ClassUnderTest {

        void throwsNullPointerException() {
            throw new NullPointerException("NullPointerException message");
        }

        void throwsArrayIndexOutOfBoundException() {
            System.out.println("some information ");
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundException message");
        }

        void printFirstBookTittle() {
            List<String> bookTittles = new ArrayList<>();
            System.out.println(String.format("first book tittle is %s", bookTittles.get(0)));
        }
    }
}
