package design.builder.classes;

import design.builder.interfaces.MealCompositeProtocol;

import java.util.ArrayList;
import java.util.List;

public class MealBox implements MealCompositeProtocol {
    private List<MealCompositeProtocol> list = new ArrayList<>();

    @Override
    public double getPrice() {
        double soma = 0;
        for (MealCompositeProtocol d : list){
            soma += d.getPrice();
        }
        return soma;
    }
    public void addMealToBox(MealCompositeProtocol meal){
        this.list.add(meal);
    }

    @Override
    public String toString() {
        return "MealBox{" +
                "list=" + list +
                '}';
    }
}
