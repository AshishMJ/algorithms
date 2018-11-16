package string_arrays.strings;

/**
 * Created by ashishm on 14/5/18.
 */
public class SubArrays {
    private int[] array;

    public SubArrays(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.array = array;
    }

    public int getCountOfAllSubArraysLessThanK(int k) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int grps = i; grps < array.length; grps++) {
                int product = 1;
                for (int j = i; j <= grps; j++) {
                    product = product * array[j];
                }
                if (product < k) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printAllSubArrays() {
        for (int i = 0; i < array.length; i++) {
            for (int grps = i; grps < array.length; grps++) {
                for (int j = i; j <= grps; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int getSumOfAllSubArrays() {
        int sum = 0;
        final int size = array.length;

        for (int i = size, j = 0; i > 0 && j < size; i--, j++) {
            sum += array[j] * (size - j) * (j + 1);
        }

        return sum;
    }
}
