package rocks.zipcode.personproperty.simple;

import java.awt.*;
import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class SimplePerson {
    private String name;
    private Date birthdate;
    private Color eyeColor;
    private Integer socialSecurityNumber;

    public SimplePerson(String name, Date birthdate, Color eyeColor, Integer socialSecurityNumber) {
        this.name = name;
        this.birthdate = birthdate;
        this.eyeColor = eyeColor;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
