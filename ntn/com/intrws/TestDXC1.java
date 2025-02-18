package ntn.com.intrws;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestDXC1 {

    public static void main(String[] args) {
/*
        int[] stocks = new int[]{1,2,3,4,5,6};

        // max profit == 5

        int[] stocks1 = new int[]{6,5,4,3,2,1};

        // loss --  -ne ,  0

        int[] stocks2 = new int[]{22,11,10,1,2,3};

        // max profit =2


        // buy at any day
        // sale at any day

        for(int i=0;i<stocks2.length;i++){

        }*/


        int[] stocks = new int[]{1,2,3,4,5,6};

        for(int i=0 ; i < stocks.length; i++){
            for(int j=i+1 ; j < stocks.length;j++){
                if(stocks[i] < stocks[j]){
                    int temp = stocks[j] ;
                    stocks[j] = stocks[i];
                    stocks[i] = temp;
                }
            }
        }

        for(int i : stocks){
            System.out.print(i+",");
        }

    }
}
