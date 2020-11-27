package learning.patterns.structure.facade;

import learning.patterns.structure.facade.impl.Dish;

import java.util.List;

public interface CookAble {

    void washProducts();

    void boilWater();

    void ShrinkProducts();

    Dish build();
}
