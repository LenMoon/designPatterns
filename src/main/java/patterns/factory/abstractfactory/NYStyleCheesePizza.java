package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.entity.Pizza;

import javax.naming.Name;

/**
 * Created by liumeng on 2016/4/10.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NY style sauce and cheese pizza";
        this.dough = "thin crust dough";
        this.sauce = "Marinara sauce";

        this.toppings.add("Grated reggiano cheese");
    }
}
