package string_arrays.strings;

public class PalindromeProblems {

    public static int getMaxLengthPalindromicSubstring(String s) {
        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i + 1);

            maxLength = Math.max(Math.max(evenLength, oddLength), maxLength);
        }

        if (maxLength == Integer.MIN_VALUE) {
            maxLength = 0;
        }

        return maxLength+1;
    }


    private static int expand(String s, int low, int high) {
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }
        return high - low;
    }
}
