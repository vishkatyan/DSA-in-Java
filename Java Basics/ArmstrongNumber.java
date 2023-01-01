import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number to check Armstrong or not");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int n =a;
        int r, sum=1;
        while(a>=1){
            r = a%10;
           sum = sum+r*r*r;
            a = a/10;
        }
        if(n == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        scr.close();

    }
}
