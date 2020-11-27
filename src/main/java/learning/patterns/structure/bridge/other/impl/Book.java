package learning.patterns.structure.bridge.other.impl;

import learning.patterns.structure.bridge.other.abstraction.Audience;

public abstract class Book {

    public Audience audience;

    public Book(Audience audience) {
        this.audience = audience;
    }

    public abstract void show();
}
