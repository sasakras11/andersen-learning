package learning.patterns.structure.bridge.other.impl;

import learning.patterns.structure.bridge.other.abstraction.Audience;

public class Science extends Book{


    public Science(Audience audience) {
        super(audience);
    }

    @Override
    public void show() {
        System.out.println("book publishing.....");

        audience.giveMark();



    }
}
