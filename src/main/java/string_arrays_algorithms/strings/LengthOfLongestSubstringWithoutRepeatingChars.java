package string_arrays_algorithms.strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingChars {

    //Time : O(n^2).
    public static int findLengthUsingNaive(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int maxLength = Integer.MIN_VALUE;

        for(int i=0; i<s.length()-1;i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            for(int j=i+1; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                }
            }

            if(maxLength < set.size()){
                maxLength = set.size();
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
