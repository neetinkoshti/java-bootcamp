package com.ntn.javaconcepts.multithreading;

public class PrintEvenOddNumberUsingThread {

    public static void main(String[] args) {

        PrintEvenOddNumbers printEvenOddNumbers = new PrintEvenOddNumbers(20);

        Thread oddNum = new Thread(() -> printEvenOddNumbers.printOddNumbers());
        Thread evenNum = new Thread(() -> printEvenOddNumbers.printEvenNumbers());

        oddNum.start();
        evenNum.start();

    }

}

class PrintEvenOddNumbers{

    private static int number=0;

    int limit;
    public PrintEvenOddNumbers(int limit){
        this.limit = limit;
    }

    public synchronized void  printEvenNumbers(){

        while(number <= limit){
            if(number%2 ==0){
                System.out.print(number+" ");
                number++;
                notify();
            }else{
                try{
                    wait();
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

    public synchronized void  printOddNumbers(){

        while(number <= limit){
            if(number%2 !=0){
                System.out.print(number+" ");
                number++;
                notify();
            }else{
                try{
                    wait();
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
