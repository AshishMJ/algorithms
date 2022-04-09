package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllSubsets {
    private int[] arr;
    private int N;
    private List<List<Integer>> result;
    private List<Integer> combinationList;

    public FindAllSubsets(int[] arr, int n) {
        this.arr = arr;
        N = n;
        result = new ArrayList<>();
        combinationList = new ArrayList<>();
    }

    /**
     * Uses subArray to produce subSets. Time complexity is O(n).
     * Dymanic programming approach.
     *
     * @param currIndex
     */
    public void findSol1(int currIndex) {
        if (currIndex == N - 1) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[currIndex]);
            result.add(list);
            return;
        }

        findSol1(currIndex + 1);

        List<List<Integer>> allSubsetsAtCurrIndex = new ArrayList<>();
        for (List<Integer> list : result) {
            List<Integer> newList = new ArrayList<>();
            newList.add(arr[currIndex]);
            newList.addAll(list);
            allSubsetsAtCurrIndex.add(newList);
        }
        result.addAll(allSubsetsAtCurrIndex);

        List<Integer> list = new ArrayList<>();
        list.add(arr[currIndex]);
        result.add(list);
    }

    /**
     * Standard Backtracking approach.
     *
     * @param currIndex
     */
    public void findSol2(int currIndex) {
        if (currIndex == N) {
            System.out.println(combinationList);
            return;
        }
        combinationList.add(arr[currIndex]);
        findSol2(currIndex + 1);
        combinationList.remove(combinationList.size() - 1);
        findSol2(currIndex + 1);
    }

    public void print() {
        Collections.reverse(result);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        FindAllSubsets findAllSubsets = new FindAllSubsets(arr, arr.length);
        findAllSubsets.findSol1(0);
        findAllSubsets.print();

        int[] arr1 = {1, 2, 3};
        FindAllSubsets findAllSubsets1 = new FindAllSubsets(arr1, arr1.length);
        findAllSubsets1.findSol2(0);
    }
}
