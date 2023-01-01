import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number to print its Table from 1 to 10");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(a +"*" +i +"=" +a*i);
        }
        scr.close();
    }
}
