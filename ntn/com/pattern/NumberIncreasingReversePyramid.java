package ntn.com.pattern;

/**
 *   1 2 3 4 5 6
 *   1 2 3 4 5
 *   1 2 3 4
 *   1 2 3
 *   1 2
 *   1
 */
public class NumberIncreasingReversePyramid {

    public static void main(String[] args) {
        int n = 6;

        printNumberIncreasingReversePyramid(n);
    }

    private static void printNumberIncreasingReversePyramid(int n) {

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n+1-i ;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
