package Stacks.src;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    private final static char ADD = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';

    private final Stack<Integer> stack;

    /**
     * Sets up this evaluator by creating a new stack.
     */
    public PostfixEvaluator() {
        stack = new Stack<>();
    }

    public int evaluate(String expr) {
        int op1, op2, result = 0;
        String token;
        Scanner parser = new Scanner(expr);

        while (parser.hasNext()) {
            token = parser.next();

            if( isOperator(token)) {

                op2 = stack.pop();
                op1 = stack.pop();
                result = evaluateSingleOperator(token.charAt(0), op1, op2);
                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return result;
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals(
                "/");
    }

    private int evaluateSingleOperator(char token, int op1, int op2) {
        int result = 0;

        switch(token) {
            case ADD -> result = op1 + op2;
            case SUBTRACT -> result = op1 - op2;
            case MULTIPLY -> result = op1 * op2;
            case DIVIDE -> result = op1 / op2;
        }
        return result;
    }

    public static void main(String[] args) {
        PostfixEvaluator postFix = new PostfixEvaluator();

        System.out.println(postFix.evaluate("3 4 * 2 5 + - 4 * 2 /"));

        System.out.println(postFix.evaluate(" 7 4 -3 * 1 5 + / *"));

    }
}
