package design.builder.classes;

import design.builder.interfaces.MealBuilderProtocol;

public class MainDishBuilder implements MealBuilderProtocol {

    private MealBox meal = new MealBox();

    @Override
    public MealBox makeMeal() {
        Rice r = new Rice("Arroz", 5);
        Beans b = new Beans("Feijão", 10);
        Meat m = new Meat("Costela", 30);
        meal.addMealToBox(r);
        meal.addMealToBox(b);
        meal.addMealToBox(m);
        return meal;
    }

    public MealBox getMeal() {
        return meal;
    }

    @Override
    public MealBox makeDessert() {
        Dessert d = new Dessert("Gin", 15);
        meal.addMealToBox(d);
        return meal;
    }
}
