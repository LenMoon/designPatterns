package patterns.factory.abstractfactory;

/**
 * Created by liumeng on 2016/4/11.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ChicagoPizzaStore style cheese pizza");
        } else if (type.equalsIgnoreCase("clams")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("chicagoPizzaStore style clams pizza");
        }
        return pizza;
    }
}
