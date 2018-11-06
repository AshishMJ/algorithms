package DP;

public class EggDroppingPuzzle {

    /**
     * k ==> Number of floors
     *   n ==> Number of Eggs
     *   eggDrop(n, k) ==> Minimum number of trials needed to find the critical
     *                     floor in worst case.
     *   eggDrop(n, k) = 1 + min{max(eggDrop(n - 1, i - 1), eggDrop(n, k - i)):
     *                  i in {1, 2, ..., k}}
     *
     */
    public static int getDropsRecursive(int eggs, int floors) {
        if (floors == 0 || floors == 1) {
            return floors;
        }

        if (eggs == 1) {
            return floors;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= floors; i++) {
            final int temp = Math.max(getDropsRecursive(eggs - 1, i - 1), getDropsRecursive(eggs, floors - i));
            min = Math.min(min, temp);
        }

        return 1 + min;
    }
}
