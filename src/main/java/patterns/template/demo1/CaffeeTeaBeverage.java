package patterns.template.demo1;

/**
 * Created by liumeng on 2016/4/15.
 */
public abstract class CaffeeTeaBeverage {
    final void prepareRecipe() {
        //将水煮沸
        boilWater();
        //冲泡
        brew();
        //倒入杯子
        pourInCup();
        //添加调料
        if(wantWithCodiments()) {
            addCondiments();
        }
    }

    boolean wantWithCodiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();
    protected void boilWater() {
        System.out.println("Boiling water");
    }
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
