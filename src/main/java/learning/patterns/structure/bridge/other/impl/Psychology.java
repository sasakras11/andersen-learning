package learning.patterns.structure.bridge.other.impl;

import learning.patterns.structure.bridge.other.abstraction.Audience;

public class Psychology extends Book{
    public Psychology(Audience audience) {
        super(audience);
    }

    @Override
    public void show() {
        System.out.println("publishing psychology book");

        audience.giveMark();
    }
}
