package patterns.factory.abstractfactory;


/**
 * Created by liumeng on 2016/4/11.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("new york style cheese pizza");
        } else if (type.equalsIgnoreCase("clams")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("new york style clam pizza");
        }

        return pizza;

    }
}
