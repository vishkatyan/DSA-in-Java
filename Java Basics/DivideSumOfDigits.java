import java.util.Scanner;
public class DivideSumOfDigits {
        public static void main(String[] args) {
            System.out.println("Enter any number to check Palindrome or not");
            Scanner scr = new Scanner(System.in);
            int a = scr.nextInt();
            int n =a;
            int r, sum=0;
            while(a>=1){
                r = a%10;
                sum = sum+r;
                a = a/10;
            }
            if(n % sum==0)
                System.out.println("Divisible by its sum of digits");
            else
                System.out.println("Not Divisible by its sum of digits");
            scr.close();

        }
    }


