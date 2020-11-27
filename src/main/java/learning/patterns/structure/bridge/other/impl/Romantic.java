package learning.patterns.structure.bridge.other.impl;

import learning.patterns.structure.bridge.other.abstraction.Audience;

public class Romantic extends Book{

    public Romantic(Audience audience) {
        super(audience);
    }

    @Override
    public void show() {
        System.out.println("publishing romantic book....");

        audience.giveMark();
    }


}
