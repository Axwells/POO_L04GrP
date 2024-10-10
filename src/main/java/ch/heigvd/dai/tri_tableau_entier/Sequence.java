package ch.heigvd.dai.tri_tableau_entier;

public class Sequence {
    private int[] seq ;
    public Sequence(int[] seq) {
        this.seq = seq;
    }
    public void sort() {
        boolean swapped;
        int n = seq.length;

        // Repeat until the array is sorted
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Go through the array and compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (seq[j] > seq[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = seq[j];
                    seq[j] = seq[j + 1];
                    seq[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    public String toString() {
        String s = new String("Sequence : ");
        for (int i = 0; i < seq.length; i++) {
            s += seq[i] + " ";
        }
        return s;
    }
}
