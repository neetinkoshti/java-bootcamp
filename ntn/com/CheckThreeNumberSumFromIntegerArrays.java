package ntn.com;

public class CheckThreeNumberSumFromIntegerArrays {

    public static void main(String[] args) {

        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int sum = 5;
        checkThreeNumSum(array , sum);
    }

    private static void checkThreeNumSum(int[] array , int sum){

        for (int i =0 ;i < array.length -1 ; i++){
            for(int j=i ; j < array.length -1 ; j++){
                for(int k=j ; k < array.length -1 ; k++){

                if(array[i] + array[j] +array[k]  == sum){
                    System.out.println(array[i] + "," +array[j] + "," +array[k]);
                }
                }
            }
        }
    }
}
