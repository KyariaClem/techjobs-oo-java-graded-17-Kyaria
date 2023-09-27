package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{



    /*public PositionType() {
        id = nextId;
        nextId++;
    }*/

    public PositionType(String value) {
        super(value);
    }
// creating toString method on TODO below

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    /*public String toString() {
        return value;
    }
    //PositionType position = new PositionType("value");

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType that)) return false;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }*/

}
