package ch.heigvd.dai;

import ch.heigvd.dai.tri_tableau_entiers.Sequence;
import ch.heigvd.dai.intClass.IntClass;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) return;

        IntClass[] sequence = new IntClass[args.length];

        // Pour chaque mot sequence doit prendre le chiffre et l'ajouter dans son vecteur
        for (int i = 0; i < args.length; i++) {
            sequence[i] = new IntClass(args[i]);
        }

        Sequence bubble = new Sequence(sequence);
        bubble.sort();

        System.out.println(bubble);
    }
}