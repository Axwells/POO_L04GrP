package ch.heigvd.dai.tri_tableau_entier;

public class Main {
    public static void main(String[] args) {
        System.out.println("WE IN THIS BIII");

        if(args.length == 0) return;

        int[] sequence = new int[args.length];

        // Pour chaque mot sequence doit prendre le chiffre et l'ajouter dans son vecteur
        for (int i = 0; i < args.length; i++) {
            sequence[i] = stringToInt(args[i]);
        }

        Sequence bubble = new Sequence(sequence);
        bubble.sort();

        System.out.println(bubble);
    }
    public static int stringToInt(String str){
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

        // Parcourir chaque caractère de la chaîne
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }
            result = result * 10 + (c - '0'); // Conversion manuelle de chaque chiffre
        }

        return result * sign; // Retourner le nombre avec son signe
    }

}

