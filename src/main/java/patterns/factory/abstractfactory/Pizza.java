package patterns.factory.abstractfactory;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by liumeng on 2016/4/11.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();


    void bake() {
        System.out.println("bake for mnutes at 350");
    }

    void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("place pizza in official pizza store box");
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough==null?"": dough.getClass().getName() +
                ", sauce=" + sauce==null?"":sauce.getClass().getName() +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese==null?"":cheese.getClass().getName()+
                ", pepperoni=" + pepperoni+
                ", clams=" + clams+
                '}';
    }
}
