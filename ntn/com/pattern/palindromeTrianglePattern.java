package ntn.com.pattern;

/**
 *           1
 *         2 1 2
 *       3 2 1 2 3
 *     4 3 2 1 2 3 4
 *   5 4 3 2 1 2 3 4 5
 * 6 5 4 3 2 1 2 3 4 5 6
 */
public class palindromeTrianglePattern {

    public static void main(String[] args) {
        int n =6;
        printPalindromeTrianglePattern(n);
    }

    private static void printPalindromeTrianglePattern(int n) {
        // for rows
        for(int i=1 ; i<=n ;i++){
            //for spaces
            for(int j =1 ; j <= i ;j--){
                System.out.print(" ");
            }
            for(int j =i ; j>=i ;j--){
                System.out.print(j+" ");
            }
        }
    }
}
