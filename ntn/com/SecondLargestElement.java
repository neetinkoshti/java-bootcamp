package com.ntn.intws;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] array = new int[]{1,4,3,2,0,7,5,8};
        int kLargestEle = 2;

        usingArraySortAndFindElement(array,kLargestEle);

        usingArrayInbuiltSortAndFindElement(array,kLargestEle);

        usingWithoutArraySortMethod(array,kLargestEle);
        
        usingJava8Method(array,kLargestEle);



    }

    private static void usingArraySortAndFindElement(int[] array, int kLargestEle) {

        for(int i=0  ; i< array.length ;i++){
            for(int j=i+1 ; j<array.length -1 ;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("After sorting array ");
        for (int x: array) {
            System.out.print(x+",");
        }

        System.out.println("Using manual sort : K's Largest Element :"+array[array.length-kLargestEle] + " and Index of this element :"+(array.length-kLargestEle));


    }

    private static void usingJava8Method(int[] array, int kLargestEle) {
        System.out.println("Using Java 8 ");
        int secondLargest = Arrays.stream(array)
                .sorted()
                .skip(array.length-kLargestEle)
                .limit(1)
                .findFirst().getAsInt();
        System.out.println(secondLargest);
    }

    private static void usingWithoutArraySortMethod(int[] array, int kLargestEle) {
        int largest = -1;
        int secondLargest = -1 ;
        for (int i=0; i<array.length;i++){
            if(array[i] > largest){
                secondLargest = largest ;
                largest = array[i];
            }else if (array[i] < largest && array[i] > secondLargest){
                secondLargest = array[i];
            }
        }

        System.out.println("Largest :"+largest + " ,Second Largest :"+secondLargest);
    }

    private static void usingArrayInbuiltSortAndFindElement(int[] array, int kLargestEle) {

        Arrays.sort(array);

        System.out.println("K's Largest Element :"+array[array.length-kLargestEle] + " and Index of this element :"+(array.length-kLargestEle));

    }
}
