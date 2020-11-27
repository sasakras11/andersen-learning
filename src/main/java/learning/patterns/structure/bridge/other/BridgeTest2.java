package learning.patterns.structure.bridge.other;

import learning.patterns.structure.bridge.other.abstraction.Children;
import learning.patterns.structure.bridge.other.abstraction.Teens;
import learning.patterns.structure.bridge.other.impl.Book;
import learning.patterns.structure.bridge.other.impl.Psychology;
import learning.patterns.structure.bridge.other.impl.Romantic;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest2 {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Psychology(new Children()));
        books.add(new Romantic(new Children()));
        books.add(new Psychology(new Teens()));


        books.forEach(Book::show);

    }
}
