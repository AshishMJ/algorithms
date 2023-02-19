package string_arrays.arrays;

public class SegregateZeroAndOne {

    /**
     * Classic 2 Pointer approach problem.
     *
     * @param arr
     */
    public static void segregate(int[] arr) {
        int fwdPtr = 0, backPtr = arr.length - 1;

        while (fwdPtr < backPtr) {
            while (arr[fwdPtr] == 0 && fwdPtr < backPtr) {
                fwdPtr++;
            }
            while (arr[backPtr] == 1 && fwdPtr < backPtr) {
                backPtr--;
            }

            if (fwdPtr < backPtr) {
                arr[fwdPtr++] = 0;
                arr[backPtr--] = 1;
            }
        }
    }
}
