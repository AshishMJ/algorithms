package stack;

import org.junit.Test;

public class ParenthesisProblemsTest {

    @Test
    public void testMaxDepth(){
        int i = ParenthesisProblems.maxDepth("1+(2*((3+4)/(2-1)))/2+56");
        System.out.println(i);

        i = ParenthesisProblems.maxDepth("1+(4/2)");
        System.out.println(i);

        i = ParenthesisProblems.maxDepth("((1))");
        System.out.println(i);

        i = ParenthesisProblems.maxDepth("1+(2*(3+4)/(2-1)))/2+56");
        System.out.println(i);
    }
}
