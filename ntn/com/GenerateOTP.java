package ntn.com;

import java.util.Random;

public class GenerateOTP {

    public static void main(String[] args) {

        System.out.println(generateOTP());
        System.out.println(generateOTPSecondWay(5));
    }

    private static int generateOTP(){

        Random random = new Random();
        return  random.nextInt(9999) + 1000;
    }

    private static int generateOTPSecondWay(int requireOtpLength){

        String str = "123456789";

        String[] strArray = str.split("");
        String otp ="";
        Random random= new Random();
        for(int i=0;i<requireOtpLength;i++){
                otp = otp + str.charAt(random.nextInt(9)) +"";
        }

        return Integer.parseInt(otp) ;
    }

}
