package string_arrays.arrays;

public class MajorityElement {

    public int findForUnSortedArray(int[] arr) {
        // Step1 : Find potential candidate.
        int candidate = 0;
        int votes = 0;
        for (int i : arr) {
            if (votes == 0) {
                candidate = i;
            }
            if (i == candidate) {
                votes++;
            } else {
                votes--;
            }
        }

        //Step2 : Check if the candidate is majority element.
        int count = 0;
        for (int value : arr) {
            if (value == candidate) {
                count++;
            }
        }
        return (count > arr.length / 2) ? 1 : -1;
    }


    public int findForSortedArray(int[] arr) {
        int i = 0;
        int ele;
        while (i < arr.length) {
           ele = arr[i];
           while(arr[i] == ele && i < arr.length){
               i++;
           }
           if((i+1) > arr.length/2){
               return 1;
           }
           i++;
        }
        return -1;
    }
}
