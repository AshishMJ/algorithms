package string_arrays.arrays;

public class RepeatingElementsProblems {

    /**
     * Pattern :
     * 1. Use arrays as a hashMap with index as key and element as value.
     * 2. Ideal for problems where elements are in the range of [1 to n].
     *
     * @param arr
     */
    public static void find2RepeatingElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elementIndex = Math.abs(arr[i]);
            if (arr[elementIndex] > 0) {
                arr[elementIndex] = arr[elementIndex] * -1;
            } else {
                System.out.println(elementIndex);
            }
        }
    }

    public static void find2NonRepeatingElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elementIndex = Math.abs(arr[i]);
            arr[elementIndex] = arr[elementIndex] * -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(i);
            }
        }
    }

    public static void countFrequency(int[] arr) {
        int i = 0, n = arr.length;

        while (i < n) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }

            int elementIndex = arr[i] - 1;
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            } else {
                arr[i] = 0;
                arr[elementIndex]--;
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println("element=" + (j+1) + ", frequency=" + Math.abs(arr[j]));
        }
    }
}
