package Assignments.Assignment_1.Test;/*
 * TCSS 342 C - Data Structures - Spring 2025
 * Instructor: Dongfang Zhao
 * Programming Assignment 1
 */

import Assignments.Assignment_1.PostfixToInfixTranslator;
import java.util.Scanner;

/**
 * This is the test class for the PostfixToInfixTranslator program.
 * This program will perform some operations to test the translate method.
 *
 * @author TCSS 143 Instruction Team
 * @version 0.3
 */
public class PostfixToInfixTest {
    /**
     * This is the main method for the PostfixToInfixTest class.
     *
     * @param theArgs is used for the commandline arguments.
     */
    public static void main(String[] theArgs) {
        System.out.println("Welcome to the Postfix to Infix Translator Testing Program!");
        System.out.println("This program will test the translation method of the PostfixToInfixTranslator class.");

        PostfixToInfixTranslator translator = new PostfixToInfixTranslator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a postfix expression to translate, or type 'exit' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                String infixExpression = translator.translate(input);
                System.out.println("The translated infix expression is: " + infixExpression);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: The input is not a proper postfix expression.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

            System.out.println("-----------------------------------------");
        }

        scanner.close();
    }
}
