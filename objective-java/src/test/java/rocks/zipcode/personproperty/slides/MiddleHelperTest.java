package rocks.zipcode.personproperty.slides;

import org.junit.Test;

/**
 * Created by leon on 3/8/18.
 */
public class MiddleHelperTest {
    @Test
    public void getMiddleTest(){
        double middle = MiddleHelper.<Double>getMiddle(3.14, 1729.0, 0.0);
        System.out.println(middle);
    }
}
