import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("1. Subraction");
        System.out.println("1. Multiplication");
        System.out.println("1. Divison");
        System.out.println("1. Enter your choice");
        Scanner scr=new Scanner(System.in);
        int ch = scr.nextInt();
        System.out.println("Enter two numbers");
        int a = scr.nextInt();
        int b = scr.nextInt();
        switch(ch){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong Choice, Try again");
        }

    }
}
