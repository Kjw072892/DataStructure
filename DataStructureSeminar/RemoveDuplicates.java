package DataStructureSeminar;

import java.util.Stack;

public class RemoveDuplicates {
    private RemoveDuplicates() {}

    public static Stack<Character> removeDuplicates(String str) {
        Stack<Character> output = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(output.isEmpty() || str.charAt(i) != output.peek()
                    && output.search(str.charAt(i)) == -1){
                output.push(str.charAt(i));
            } else if(str.charAt(i) == output.peek()) {
                output.pop();
            }
        }


        return output;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("aabbacactc"));
        System.out.println(removeDuplicates("azzaazazcz"));
        System.out.println(removeDuplicates("abracadabra"));
    }

}
