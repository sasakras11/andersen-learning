package learning.patterns.structure.facade.impl;

import learning.patterns.structure.facade.Product;

import java.util.List;

public class Dish {

    private final String name;
    private final List<Product> products;

    public Dish(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
