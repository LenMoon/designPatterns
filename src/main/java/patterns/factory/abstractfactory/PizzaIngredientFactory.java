package patterns.factory.abstractfactory;

/**
 * Created by liumeng on 2016/4/11.
 */

/**
 * 原料工厂的接口
 * 每个区域的原料工厂都必须实现该接口。
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
