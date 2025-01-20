package ntn.com.pattern;


/**
 *       1
 *      2 2
 *     3 3 3
 *    4 4 4 4
 *   5 5 5 5 5
 *  6 6 6 6 6 6
 */

public class NumberTriangularPattern {

    public static void main(String[] args) {
        int n = 6;
        printNumberTriangularPattern(n);
    }

    private static void printNumberTriangularPattern(int n) {

        for(int i=1;i<= n ;i++){
            for(int k = 0;k < n-i;k++){
                System.out.print(" ");
            }
            for(int j=1 ; j <= i ;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
