package ntn.com;

public class PrintPrimeNumbers {

    public static void main(String[] args) {

        int n = 45 ;

        printPrimeNumbers(n);
    }

    private static void printPrimeNumbers(int n) {

        for(int num =1; num < n ; num++){
            int counter = 0;
            for(int j = 1 ; j <= num ;j++){
                if(num % j == 0){
                    counter++;
                }
            }

            if(counter == 2){
                System.out.print(num+" ");
            }
        }


    }
}
