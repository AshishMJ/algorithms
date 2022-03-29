package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubArrays {
    private int[] arr;
    private int N;

    public PrintAllSubArrays(int[] arr, int n) {
        this.arr = arr;
        N = n;
    }

    public List<String> printSubArrayRecursive(int currIndex) {
        if (currIndex == N - 1) {
            return Arrays.asList(String.valueOf(arr[currIndex]));
        }
        List<String> prevResult = printSubArrayRecursive(currIndex + 1);
        print(prevResult);

        List<String> result = new ArrayList<>();
        result.add(String.valueOf(arr[currIndex]));

        for (String s : prevResult) {
            result.add(arr[currIndex] + "," + s);
        }
        return result;
    }

    public void print(List<String> s) {
        s.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        PrintAllSubArrays printAllSubArrays = new PrintAllSubArrays(arr, arr.length);
        List<String> list = printAllSubArrays.printSubArrayRecursive(0);
        printAllSubArrays.print(list);
    }
}

