package design.builder.classes;

import design.builder.interfaces.MealCompositeProtocol;

public abstract class AbstractMeal implements MealCompositeProtocol {
    private String name;
    private double price;

    public AbstractMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractMeal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
