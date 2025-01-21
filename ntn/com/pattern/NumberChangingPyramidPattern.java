package ntn.com.pattern;

/**
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20 21
 */
public class NumberChangingPyramidPattern {

    public static void main(String[] args) {

        int n = 6 ;

        printNumberChangingPyramidPattern(n);
    }

    private static void printNumberChangingPyramidPattern(int n) {
        int num =1;
        for(int i =1 ; i<=n;i++){

            for(int j = 1 ; j<=i ;j++){
                System.out.print(num+++" ");
            }
            System.out.println("");
        }
    }
}
