package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllSubsets {
    private int[] arr;
    private int N;
    private List<List<Integer>> result;

    public FindAllSubsets(int[] arr, int n) {
        this.arr = arr;
        N = n;
        result = new ArrayList<>();
    }

    public void find(int currIndex) {
        if (currIndex == N - 1) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[currIndex]);
            result.add(list);
            return;
        }

        find(currIndex + 1);

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

    public void print() {
        Collections.reverse(result);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        FindAllSubsets findAllSubsets = new FindAllSubsets(arr, arr.length);
        findAllSubsets.find(0);
        findAllSubsets.print();
    }
}
