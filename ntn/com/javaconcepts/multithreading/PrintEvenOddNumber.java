package ntn.com.javaconcepts.multithreading;

public class PrintEvenOddNumber {

    public static void main(String[] args) {

        PrintEvenOddNum oddEvenNum = new PrintEvenOddNum(10);

        Thread oddThread = new Thread(() -> oddEvenNum.printOddNum());
        Thread evenThread = new Thread( () -> oddEvenNum.printEvenNum() );

        oddThread.start();
        evenThread.start();
    }
}

class PrintEvenOddNum{

    static volatile int counter = 1;

    int limit = 0;

    public PrintEvenOddNum(int limit) {
        this.limit = limit;
    }

    public synchronized void printEvenNum(){

        while( counter <= limit){

            if(counter % 2 == 0){

                System.out.println("Even Num : "+ counter);
                counter++;
                notify();
            }else{
                try{
                    wait();
                }catch (InterruptedException ex){
                    System.out.println("Even exception :"+ex);
                }
            }
        }
    }

    public synchronized void printOddNum(){

        while( counter <= limit){

            if(counter % 2 != 0){

                System.out.println("Odd Num : "+ counter);
                counter++;
                notify();
            }else{
                try{
                    wait();
                }catch (InterruptedException ex){
                    System.out.println("Odd exception :"+ex);
                }
            }
        }
    }

}
