package patterns.factory.simplefactory.entity;

/**
 * Created by liumeng on 2016/4/10.
 */
public abstract   class Pizza {
    protected String discription;

    public void prepare() {
        discription += " ,prepare";
    }

    public void bake() {
        discription += " ,bake";
    }

    public void cut() {
        discription += " ,cut";
    }

    public void box() {
        discription += "cut";

    }


}
