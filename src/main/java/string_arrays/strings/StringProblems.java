package string_arrays.strings;

public class StringProblems {

    public static boolean isRotation(String s1, String s2) {
        int i = 0, N = s1.length();
        int j = s2.indexOf(s1.charAt(0));
        boolean isRotation = true;

        while (i < N) {
            if (s1.charAt(i) != s2.charAt(j)) {
                isRotation = false;
                break;
            }
            i++;
            j = (j + 1) % N;
        }
        return isRotation;
    }
}
