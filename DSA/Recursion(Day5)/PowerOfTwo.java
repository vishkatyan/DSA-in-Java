import java.util.Scanner;

// check if a no is power of two
public class PowerOfTwo {
    static boolean powerCheck(int a){
        if(a==1){
            return false;
        }
        if(powerCheck(a/2) && a==0){
        return true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a no to check...");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        System.out.println(powerCheck(a));

    }
}
