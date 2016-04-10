package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.entity.Pizza;

/**
 * Created by liumeng on 2016/4/10.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new NYStyleCheesePizza();
        }else{
            return null;
        }
    }
}
