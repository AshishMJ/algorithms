package string_arrays.arrays;

public class AllArrayProblems {

    public static int minIncrementsToRemoveDup(int[] arr) {
        int prev = 0, curr = 1;
        int minIncrement = 0;
        while (curr < arr.length) {
            if (arr[prev] >= arr[curr]) {
                int inc = (arr[prev] + 1) - arr[curr];
                minIncrement += inc;
                arr[curr] += inc;
            }
            prev++;
            curr++;
        }
        return minIncrement;
    }
}
