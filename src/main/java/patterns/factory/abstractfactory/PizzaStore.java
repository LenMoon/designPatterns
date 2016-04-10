package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.entity.Pizza;

import java.lang.reflect.Type;

/**
 * Created by liumeng on 2016/4/10.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String Type) {
        Pizza pizza;
        pizza = createPizza(Type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
