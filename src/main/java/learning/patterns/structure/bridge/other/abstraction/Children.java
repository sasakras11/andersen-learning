package learning.patterns.structure.bridge.other.abstraction;

import learning.patterns.structure.bridge.other.impl.Book;

public class Children implements Audience{


    @Override
    public void giveMark() {
        System.out.println(" book is interesting for children......");
    }
}
