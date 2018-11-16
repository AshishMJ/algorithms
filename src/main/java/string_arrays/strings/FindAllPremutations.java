package string_arrays.strings;

public class FindAllPremutations {

    public static void permute(char[] chars, int l, int r) {
        if(l == r){
            System.out.println(chars);
        }

        for (int i = l; i < r; i++) {
            final char[] swappedArray = swap(chars, l, i);
            permute(swappedArray, l+1, r);
            swap(chars, l, i);
        }
    }

    private static char[] swap(char[] input, int l, int r) {
        char temp = input[l];
        input[l] = input[r];
        input[r] = temp;
        return input;
    }
}
