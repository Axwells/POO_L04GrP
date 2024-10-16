package ch.heigvd.dai.tri_tableau_entiers;

import ch.heigvd.dai.intClass.IntClass;

public class Sequence {
    private IntClass[] seq;

    public Sequence(IntClass[] seq) {
        this.seq = seq;
    }

    public void sort() {
        boolean swapped;
        int n = seq.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (seq[j].getValue() > seq[j + 1].getValue()) {
                    /* Solution below work too
                    IntClass.swapTabElements(seq, j + 1, j);
                    IntClass.swapValues(seq[j], seq[j + 1]);*/
                    seq[j].swapValues(seq[j + 1]);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public String toString() {
        String s = new String("Sequence : ");
        for (IntClass j : seq) {
            s += j.getValue() + " ";
        }
        return s;
    }
}
