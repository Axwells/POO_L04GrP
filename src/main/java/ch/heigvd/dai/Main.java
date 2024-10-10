package ch.heigvd.dai;
import ch.heigvd.dai.intClass.IntClass;

public class Main {
    public static void main(String[] args) {



        //Test de la partie 2 : Classe int
        IntClass myInt = new IntClass(12);
        System.out.println("Valeur après instanciation: " + myInt.getValue());
        myInt.setValue(-6408);
        System.out.println("Valeur après modififcation: " + myInt.getValue());
        System.out.println("Valeur en string: " + myInt.toString());




    }
}