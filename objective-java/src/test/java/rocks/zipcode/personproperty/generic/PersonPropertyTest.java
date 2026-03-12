package rocks.zipcode.personproperty.generic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class PersonPropertyTest {
    @Test
    public void testInteger() {
        // Given
        Integer expected = Integer.MAX_VALUE;
        Container<Integer> personProperty = new Container<>(expected);

        // When
        Integer actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testString() {
        // Given
        String expected = "_";
        Container<String> personProperty = new Container<>(expected);

        // When
        String actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testDate() {
        // Given
        Date expected = new Date(System.currentTimeMillis());
        Container<Date> personProperty = new Container<>(expected);

        // When
        Date actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
