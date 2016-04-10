package patterns.factory.simplefactory;

import patterns.factory.simplefactory.entity.Pizza;

/**
 * Created by liumeng on 2016/4/10.
 */
public class PizzaStrore {
    SimplePizzaFactory factory;

    public PizzaStrore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza=null;
        pizza = factory.createPrizza(type);


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
