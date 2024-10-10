package ch.heigvd.dai.intClass;

public class IntClass {

    private int value;

    public IntClass(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int i) {
        value = i;
    }

    public String toString() {
        return String.valueOf(value);
    }
}