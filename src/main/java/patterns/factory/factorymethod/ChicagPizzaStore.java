package patterns.factory.factorymethod;

import patterns.factory.factorymethod.entity.Pizza;

/**
 * Created by liumeng on 2016/4/10.
 */
public class ChicagPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
