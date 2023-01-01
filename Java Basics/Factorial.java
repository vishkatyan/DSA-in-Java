import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a no to find its factorial");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int fact=1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        System.out.println(fact);
        scr.close();
    }
}

