package ch.heigvd.dai.intClass;

public class IntClass {

    private int value;

    public IntClass(int i) {
        value = i;
    }

    public IntClass(String str){
        value = stringToInt(str);
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


    public void swapValues(IntClass intClass) {
        int temp = value;
        value = intClass.getValue();
        intClass.setValue(temp);
    }

    public static void swapTabElements(IntClass[] tab, int i, int j) {
        IntClass temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    public static void swapValues(IntClass i, IntClass j) {
        int temp = i.getValue();
        i.setValue(j.getValue());
        j.setValue(temp);
    }

    private int stringToInt(String str) {
        int result = 0;
        int sign = 1;
        int i = 0;

        // Vérification du signe + ou -
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        for (; i < str.length(); i++) {
            char c = str.charAt(i);

            //ChatGPT
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }
            result = result * 10 + (c - '0'); // allows multiple digits numbers
        }
        return result * sign;
    }
}