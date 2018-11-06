package HackerRankIOTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromSTDInput {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements.");
        int N = in.nextInt();
        System.out.println("Enter "  + N + " elements.");

        List<Integer> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        System.out.println("Entered Elements are : ");
        list.forEach(System.out::println);

    }
}
