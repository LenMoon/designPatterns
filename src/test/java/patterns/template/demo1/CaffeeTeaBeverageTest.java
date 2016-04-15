package patterns.template.demo1;

import org.junit.Test;
import patterns.facade.SonyTV;

import static org.junit.Assert.*;

/**
 * Created by liumeng on 2016/4/15.
 */
public class CaffeeTeaBeverageTest {

    @Test
    public void testPrepareRecipe() throws Exception {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
