package string_arrays.strings;

public class ReverseStringUsingRecursion {

    private static String reverse(String inp){
        if(inp.length() == 1 || inp.length() == 0){
            return inp;
        }else{
            return inp.charAt(inp.length()-1) + reverse(inp.substring(0, inp.length()-2));
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("ashish"));
    }
}
