package rocks.zipcode.personproperty.generic;

/**
 * Created by leon on 3/8/18.
 */
public class Container<E> {
    private E value;

    public Container(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }


}