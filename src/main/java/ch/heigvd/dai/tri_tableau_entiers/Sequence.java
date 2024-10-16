package ch.heigvd.dai.tri_tableau_entiers;

public class Sequence {
    private int[] seq;

    public Sequence(int[] seq) {
        this.seq = seq;
    }

    public void sort() {
        boolean swapped;
        int n = seq.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (seq[j] > seq[j + 1]) {
                    int temp = seq[j];
                    seq[j] = seq[j + 1];
                    seq[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public String toString() {
        String s = new String("Sequence : ");
        for (int j : seq) {
            s += j + " ";
        }
        return s;
    }
}
