package patterns.factory.abstractfactory.entity;

import java.util.ArrayList;

/**
 * Created by liumeng on 2016/4/10.
 */
public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough..");
        System.out.println("adding sauce");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("bake for 25 mnutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official pizzastore box");
    }

    public String getName() {
        return name;
    }


}
