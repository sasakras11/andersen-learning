package learning.java_8.lambda;


import java.util.ArrayList;
import java.util.List;

/**
 *
 *  Lambda це спосіб вставити якусь логіку(код) в метод
 *  також це спосіб обійтися без анонімних класів
 *
 *  Любі інтрфейси з одним метод можна ( і треба) записувати
 *  лямбла вираженієм
 *
 *
 */
public class Lambda{
    public static void main(String[] args) {

List<String> stringList = new ArrayList<>();
        stringList.add("1dwqd");
        stringList.add("2312312");
        stringList.add("bas");
        stringList.add("vbwbwebw");


        stringList.sort((x,y)-> x.length()-y.length());

        System.out.println(stringList);


    }
}
