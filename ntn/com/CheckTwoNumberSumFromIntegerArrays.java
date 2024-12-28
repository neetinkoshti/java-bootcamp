package ntn.com;

public class CheckTwoNumberSumFromIntegerArrays {

    public static void main(String[] args) {

        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int sum = 5;
        checkTwoNumSum(array , sum);
    }

    private static void checkTwoNumSum(int[] array , int sum){

        for (int i =0 ;i < array.length -1 ; i++){
            for(int j=i ; j < array.length -1 ; j++){

                if(array[i] + array[j] == sum){
                    System.out.println(array[i] + "," +array[j]);
                }
            }
        }

    }
}
