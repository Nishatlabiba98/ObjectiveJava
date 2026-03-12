package rocks.zipcode.personproperty.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class GenericPersonTest {
    private String expectedName;
    private Date expectedDate;
    private Color expectedEyeColor;
    private Integer expectedSsn;
    private GenericPerson genericPerson;

    @Before
    public void setup() {
        this.expectedName = "Leon";
        this.expectedDate = new Date(System.currentTimeMillis());
        this.expectedEyeColor = Color.BLACK;
        this.expectedSsn = Integer.MAX_VALUE;
        this.genericPerson = new GenericPerson(expectedName, expectedDate, expectedEyeColor, expectedSsn);
    }
    @Test
    public void testName() {
        String actual = genericPerson.name.getValue();
        Assert.assertEquals(expectedName, actual);
    }


    @Test
    public void testBirthDate() {
        Date actual = this.genericPerson.birthdate.getValue();
        Assert.assertEquals(expectedDate, actual);
    }


    @Test
    public void testEyeColor() {
        Color actual = this.genericPerson.eyeColor.getValue();
        Assert.assertEquals(expectedEyeColor, actual);
    }

    @Test
    public void testSocialSecurityNumber() {
        Integer actual = this.genericPerson.socialSecurityNumber.getValue();
        Assert.assertEquals(expectedSsn, actual);
    }
}
