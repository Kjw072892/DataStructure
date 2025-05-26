package Assignments.Assignment_3;

import java.util.Arrays;

public class PascalTriangle {

    public static String pascal(final int n) {
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            result[i] = pascal(n, i);
        }
       return Arrays.toString(result);
    }
    public static int pascal(int m, int n){
        if(n == 0 || n == m){
            return 1;
        }
        return pascal(m - 1, n - 1) + pascal(m - 1, n);
    }

    public static void main(String[] args) {
        System.out.println(pascal(5));
    }


}
