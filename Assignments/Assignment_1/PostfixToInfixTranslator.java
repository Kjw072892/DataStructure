package Assignments.Assignment_1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Course: Data Structure
 * Instructor: Dongfang Zhao
 * Assignment Name: Postfix to Infix Translator
 * Due Date: 4/18/2025
 *
 * @author Kassie Whitney
 * @version 4.17.2025
 */
public class PostfixToInfixTranslator {
    /**
     * The data structured used to hold postfix and infix data.
     */
   private final Stack<String> stack;

    public PostfixToInfixTranslator() {
        stack = new Stack<>();
    }

    /**
     * Translates postfix equations to a more familiar infix notation.
     *
     * @author Kassie Whitney
     * @param thePostFix String interpretation of the postfix equation
     * @return the Infix translation of the given Postfix equation.
     */
    public String translate(final String thePostFix) {

        Scanner parser = new Scanner(thePostFix);
        String token;

        while(parser.hasNext()) {
            token = parser.next();

            if(isOperator(token)) {

                if(stack.size() > 1) {
                    String num2 = stack.pop();
                    String num1 = stack.pop();
                    String result = String.format("(%s %s %s)", num1, token, num2);
                    stack.push(result);
                }

            } else {
                stack.push(token);
            }
        }

    return stack.pop();

    }

    /**
     * Checks if the parsed string is an operator or not.
     *
     * @author Kassie Whitney;
     * @param theOperator the parsed string.
     * @return the boolean value of the parsed string is an operator.
     */
    private boolean isOperator(final String theOperator) {

        String ADD = "+";
        String SUBTRACT = "-";
        String MULTIPLY = "*";
        String DIVIDE = "/";
        return theOperator.equals(ADD) || theOperator.equals(SUBTRACT) || theOperator.equals(MULTIPLY)
                || theOperator.equals(DIVIDE);
    }

}
