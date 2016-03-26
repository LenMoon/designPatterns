package patterns.strategy.demo3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by liumeng on 2016/3/26.
 */
public class QuackNo implements QuackBehaviour{

    public void quack() {
        System.out.println("不能叫");
    }
}
