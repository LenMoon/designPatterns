package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.entity.Pizza;

/**
 * Created by liumeng on 2016/4/10.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "Chicago style Deep dish cheese pizza";
        this.dough = "Extra thick crust dough";
        this.sauce = "Plum tomato sauce";

        this.toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
