package rocks.zipcode.personproperty.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class SimplePersonTest {
    private String expectedName;
    private Date expectedDate;
    private Color expectedEyeColor;
    private Integer expectedSsn;
    private SimplePerson simplePerson;

    @Before
    public void setup() {
        this.expectedName = "Leon";
        this.expectedDate = new Date(System.currentTimeMillis());
        this.expectedEyeColor = Color.BLACK;
        this.expectedSsn = Integer.MAX_VALUE;
        this.simplePerson = new SimplePerson(expectedName, expectedDate, expectedEyeColor, expectedSsn);
    }
    @Test
    public void testName() {
        String actual = this.simplePerson.getName();
        Assert.assertEquals(expectedName, actual);
    }


    @Test
    public void testBirthDate() {
        Date actual = this.simplePerson.getBirthdate();
        Assert.assertEquals(expectedDate, actual);
    }


    @Test
    public void testEyeColor() {
        Color actual = this.simplePerson.getEyeColor();
        Assert.assertEquals(expectedEyeColor, actual);
    }

    @Test
    public void testSocialSecurityNumber() {
        Integer actual = this.simplePerson.getSocialSecurityNumber();
        Assert.assertEquals(expectedSsn, actual);
    }
}
