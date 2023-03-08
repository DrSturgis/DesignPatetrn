import design.builder.classes.*;
import design.builder.interfaces.MealCompositeProtocol;
import design.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        /*
        SINGLETON
        Singleton s = Singleton.getSingleton();
        Singleton l = Singleton.getSingleton();

        System.out.println(s == l);
         */

        MainDishBuilder dish = new MainDishBuilder();
        dish.makeMeal();
        dish.makeDessert();
        System.out.println(dish.getMeal());
        System.out.println(dish.getMeal().getPrice());





    }
}