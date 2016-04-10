package patterns.factory.simplefactory;

import patterns.factory.simplefactory.entity.*;

/**
 * Created by liumeng on 2016/4/10.
 */
public class SimplePizzaFactory {
    public Pizza createPrizza(String type) {
        Pizza pizza=null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();

        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }

}
