package design.builder.interfaces;

import design.builder.classes.MealBox;

public interface MealBuilderProtocol {

    public abstract MealBox makeMeal();
    public abstract MealBox makeDessert();
}
