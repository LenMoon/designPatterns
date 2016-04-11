package patterns.factory.abstractfactory;

/**
 * Created by liumeng on 2016/4/11.
 */
public class PizzaTestDriver {

    public static void main(String[] args) {
        PizzaStore nypizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nypizzaStore.orderPizza("cheese");

        System.out.println(pizza);

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza);


    }
}
