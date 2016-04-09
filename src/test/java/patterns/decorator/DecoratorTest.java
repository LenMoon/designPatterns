package patterns.decorator;

import org.junit.Test;
import patterns.decorator.peiliao.Mocha;
import patterns.decorator.peiliao.Whip;
import patterns.decorator.yinliao.DarkRoast;

import static org.junit.Assert.*;

/**
 * Created by liumeng on 2016/4/9.
 */
public class DecoratorTest {

    @Test
    public void testCoast() {

        //来一份双倍摩卡的DarkRoast

        Beverage beverage = new Mocha(new Mocha(new DarkRoast()));

        assertEquals(1.03,beverage.coast(),0);

        //再加点奶泡吧
        beverage = new Whip(beverage);
        assertEquals(1.25,beverage.coast(),0);

        //一份奶泡没感觉再来一份吧

        beverage = new Whip(beverage);

        assertEquals(1.47, beverage.coast(), 0);


    }

}