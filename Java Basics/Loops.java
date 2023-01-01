import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //for loop --> best for them who know starting and ending
        // ques 1
        // To print in reverse order
//        for(int i =10; i>=1;i--){
//            System.out.println(i);
//        }

        // Ques 2 --> Prime Number
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Enter any no to check");
//        int  a= scr.nextInt();
//        int count =0;
//        for (int i =2; i<=a-1; i++){ // we are not going to divide by 1 and the number itself, that's why we take int i=2 and i<=a-1
//            if(a%i==0){
//                count++;
//            }
//        }
//        System.out.println(count>0 ? "Not a Prime no" : "Prime Number"); // shortcut for if-else
//        scr.close();

        // Ques3 --> Given a number and print its digits
        int a = 12345;
        int count=0;
        // step1 --> count digits
        for(int i=a; i!=0 ;i = i/10){
            count++;
        }
        //System.out.println(count);
        // step2 --> After count, compute the power
        int pow = 1;
        for(int i =1; i<=count-1; i++){
            pow = pow*10;
        }
        //System.out.println(pow);
        // step3 --> Logic for printitng
        for(int i =a; i!=0;pow=pow/10){
            System.out.println(i/pow);
            i=i%pow;

        }





    }
}
