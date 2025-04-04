package DataStructureSeminar.src;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    private RemoveDuplicates() {}

    public static Stack<String> removeDuplicates(String str) {
        Stack<String> output= new Stack<>();

        Scanner parse = new Scanner(str);

        while (parse.hasNext()) {

            try {
                if (!parse.next().equals(output.peek())) {
                    output.push(parse.next());
                } else if(parse.next().equals(output.peek())) {
                    output.pop();
                }
            } catch (NoSuchElementException NSE) {

            }
        }

        return output;
    }

    public static void main(String[] args) {
        RemoveDuplicates.removeDuplicates("abbaca");
    }

}
