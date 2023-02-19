package stack;

import java.util.Stack;

public class ParenthesisProblems {

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = Integer.MIN_VALUE;
        int i = 0, N = s.length(), currentDepth = 0;
        while (i < N) {
            //If opening brace,
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                currentDepth++;
                maxDepth = Math.max(currentDepth, maxDepth);
            }

            //If Closing brace
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.pop() == '(') {
                    currentDepth--;
                } else {
                    return -1;
                }
            }
            i++;
        }
        return maxDepth;
    }
}
