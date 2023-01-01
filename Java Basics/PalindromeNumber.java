import java.util.Scanner;
public class PalindromeNumber {
        public static void main(String[] args) {
            System.out.println("Enter any number to check Palindrome or not");
            Scanner scr = new Scanner(System.in);
            int a = scr.nextInt();
            int n =a;
            int r, sum=0;
            while(a>=1){
                r = a%10;
                sum = (sum*10)+r;
                a = a/10;
            }
            if(n == sum)
                System.out.println("Palindrome Number");
            else
                System.out.println("Not a Palindrome Number");
            scr.close();

        }
    }


