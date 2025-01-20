package ntn.com.pattern;

/**
 *  ******
 *  *    *
 *  *    *
 *  *    *
 *  *    *
 *  ******
 */
public class SquareHallowPattern {

    public static void main(String[] args) {
        int n = 6;

        printSquareHallowPattern(n);
    }

    private static void printSquareHallowPattern(int n) {

        for(int i=0 ;i < n ;i++){ // this outer loop for ROWS

            for(int j=0 ; j< n ;j++){ // this inner loop for columns

                if(i==0 || i == n-1 || j==0 || j ==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
              System.out.println("");
        }
    }
}
