package learning.patterns.structure.facade;

import learning.patterns.structure.facade.impl.Dish;

public class FacadeTest {
    public static void main(String[] args) {


        RestaurantPro restaurantPro = new RestaurantPro();


        System.out.println(new RestaurantPro().makeDish("soup"));
    }
}
