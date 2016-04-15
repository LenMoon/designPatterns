package patterns.template.demo1;

/**
 * Created by liumeng on 2016/4/15.
 */
public class Tea  extends CaffeeTeaBeverage {


     void addCondiments() {
        System.out.println("Adding Lemon");
    }

    void brew() {
        System.out.println("steeping the tea");
    }

}
