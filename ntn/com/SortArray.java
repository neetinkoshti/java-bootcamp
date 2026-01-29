package com.ntn.intws;

public class SortArray {

    public static void main(String[] args) {

        // time complexity O(n^2)
        usingBruteForceMethod();

        // time complexity O(n^2)
        bubbleSortAlgorithm();

        // time complexity O(n^2)
        bubbleSortAlgorithm1();

        // time complexity O(n^2)
        selectionSortAlgorithm();

        insertionSortAlgorithm();
    }

    private static void insertionSortAlgorithm() {

        System.out.println("\n Using Insertion Sort Algorithm ");
        int[] array = new int[]{1,4,3,2,8,0,5,7};

        int[] newArray = new int[array.length];

        newArray[0] = array[0];

        for(int x=0 ;x <array.length ;x++){

            for (int i=0;i<newArray.length-1;i++){

                if(newArray[i] > array[i+1]){
                    int temp = newArray[i];
                    newArray[i] = array[i+1];
                    newArray[i+1] = temp ;
                }
            }
        }

        printArray(newArray);
    }

    private static void selectionSortAlgorithm() {
        System.out.println("\n Using Selection Sort Algorithm ");
        int[] array = new int[]{1,4,3,2,8,0,5,7};

        for(int i =0;i < array.length ;i++){
            int smallestElement = i;
            for(int j = i+1 ; j<array.length;j++){
                if(array[smallestElement] > array[j]){
                    smallestElement = j ;
                }
            }
            int temp = array[i] ;
            array[i] = array[smallestElement];
            array[smallestElement] = temp;
        }

        printArray(array);
    }

    private static void bubbleSortAlgorithm1() {

        System.out.println("\n Using Bubble Sort Algorithm using for loop ");

        int[] array = new int[]{1,4,3,2,8,0,5,7};

        int arrLen = array.length;
        int x= 0;

            for(int i =0 ; i < array.length-1 ; i++){
                for(int j = 0 ;j <array.length-i-1 ; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp ;
                    }
                }
            }
        printArray(array);
    }

    private static void bubbleSortAlgorithm() {

        System.out.println("\n Using Bubble Sort Algorithm ");

        int[] array = new int[]{1,4,3,2,8,0,5,7};

        int arrLen = array.length;
        int x= 0;
        while(x < arrLen){
            for(int i =0 ;i < array.length-1 ;i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp ;
                }
            }
            arrLen--;
        }

        printArray(array);
    }


    private static void usingBruteForceMethod() {
        int[] array = new int[]{1,4,3,2,8,0,5,7};
        System.out.println("Using Brute Force Method");
        for(int i=0  ; i< array.length ;i++){
            for(int j=i+1 ; j<array.length  ;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }


    private static void printArray(int[] array) {
        for (int k: array) {
            System.out.print(k+" ");
        }
    }
}
