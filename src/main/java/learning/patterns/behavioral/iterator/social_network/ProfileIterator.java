package learning.patterns.behavioral.iterator.social_network;

public interface ProfileIterator {

    boolean hasNext();


    Profile getNext();

    void reset();
}
