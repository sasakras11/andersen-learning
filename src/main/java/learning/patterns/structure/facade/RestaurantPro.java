package learning.patterns.structure.facade;

import learning.patterns.structure.facade.impl.*;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPro implements Shief {


    @Override
    public Dish makeDish(String name) {

        if(name.equals("soup")) {
            List<Product> productList = new ArrayList<>();
            productList.add(new Water());
            productList.add(new Corn());
            productList.add(new Meat());
            productList.add(new Potato());
            productList.add(new Salade());

            Cook cook = new Cook(productList);

            cook.boilWater();
            cook.washProducts();
            cook.ShrinkProducts();
            return cook.build();
        }
        return null;
    }
}
