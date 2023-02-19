package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayProblems {
    private int[] arr;
    private int N;

    public SubArrayProblems(int[] arr, int n) {
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

    public static void printSubArrayWithSum(int[] arr, int K) {
        int i = 0, N = arr.length;

        while (i <= N - 1) {
            int j = i + 1;
            int sum = arr[i];
            while (sum < K && j < N) {
                sum = sum + arr[j];
                j++;
            }
            if (sum == K) {
                for (int l = i; l < j; l++) {
                    System.out.println(arr[l] + " ");
                }
                break;
            }
            if (sum > K) {
                i++;
            }
        }
    }

    public void print(List<String> s) {
        s.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        SubArrayProblems subArrayProblems = new SubArrayProblems(arr, arr.length);
        List<String> list = subArrayProblems.printSubArrayRecursive(0);
        subArrayProblems.print(list);
    }
}

