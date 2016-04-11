package patterns.factory.abstractfactory;

/**
 * Created by liumeng on 2016/4/11.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCurstDough();
    }

    public Sauce createSauce() {
        return new PlumTomateSauce();
    }

    public Cheese createCheese() {
        return new MozzarelleCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(),new Mushroom(),new Cnion(),new RedPapper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }



}
