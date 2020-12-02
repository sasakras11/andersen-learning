package learning.multithreading.alishev.semaphore;

import java.util.concurrent.Semaphore;

/**
 *  це клас використоввуєьться коли у нас є ресурс і з ним
 *  працює декілька потоків і ми хочемо щоб лише декілька потоків одночасно
 *  могли б з ним взаємодіяти
 *
 *  Приклад - у нас є удальонна бд і одночасно з нею може працювати
 *  лише 4 потоки. А у нас є 10 потоків в программі. В такому випадку було
 *  б добре звертатися до ресурсу по черзі. Для цього і є Семафор
 */
public class AlishevSemaphore {


    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3); // permits -  розмір пула

        try {



            semaphore.acquire(); // взяти  разрешение з пула. Якщо його немає то чекати поки воно зваільниться
            semaphore.acquire();
            semaphore.acquire();

            System.out.println("All permits have been acquired!");

            semaphore.acquire(); // тут поток і зупиниться, він буде чекати поки хтось з потоків звільнить
                              // звільнить місце

            System.out.println("cant reach here!!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release(); //  вернути разрешение назад в пул


        System.out.println(semaphore.availablePermits()); // подивитися скільки лишилося в пулі
    }





}


