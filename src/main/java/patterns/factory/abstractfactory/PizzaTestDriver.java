package patterns.factory.abstractfactory;

import patterns.factory.abstractfactory.entity.Pizza;

/**
 * Created by liumeng on 2016/4/10.
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println("ethan ordered a " + pizza.getName()+"\r\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Jole ordered a "+pizza.getName()+"\r\n");

    }

}
