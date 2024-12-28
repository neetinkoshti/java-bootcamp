package ntn.com;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = new int[] { 1,5,2,3,6,8,9,15};
        int searchNum = 10 ;
        System.out.println(searchFound(array , searchNum));
    }

    private static boolean searchFound(int[] array , int searchNum){

        for(int i=0;i< array.length-1 ; i++){
            if(array[i] == searchNum){
                return true;
            }
        }
        return false;
    }
}
