package string_arrays_algorithms.strings;

/**
 * Created by ashishm on 14/5/18.
 */
public class SubSequences {
    private int[] array;

    public SubSequences(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.array = array;
    }

    public void printAllSubsequences() {
        int size = 1 << array.length;

        for (int i = 0; i < size; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array.length; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(array[j]);
                }
            }
            System.out.println(" }");
        }
    }
}
