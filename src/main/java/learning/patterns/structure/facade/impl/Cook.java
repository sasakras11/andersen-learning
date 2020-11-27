package learning.patterns.structure.facade.impl;

import learning.patterns.structure.facade.CookAble;
import learning.patterns.structure.facade.Product;

import java.util.List;

public class Cook implements CookAble {

    List<Product> productList;

    public Cook(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void washProducts() {
        System.out.println(" cook washed ingredients....");
    }

    @Override
    public void boilWater() {
        System.out.println("cook washed water....");
    }

    @Override
    public void ShrinkProducts() {
        System.out.println("cook shrink products....");
    }

    @Override
    public Dish build() {
        System.out.println("Dish is ready!.....");
        return new Dish("soup",productList);

    }
}
