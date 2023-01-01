import java.math.BigInteger;
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // int x= Integer.parseInt(args[0]);
        // int y= Integer.parseInt(args[1]);
        // int z= x+y;
        // System.out.println(z);

        BigInteger bigInt = new BigInteger("7917490729047923479023749023");

        // How to take input in java?
        System.out.println("Enter your name: ");
        // Reads one char at a time and return ASCII Value of char read.
        // int x =  System.in.read();
        
        // scanner acts as buffer(piece of data) that stores input
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();   //predefined method in scanner class whose work is to take input.
//        String name = scr.next();   //
        System.out.println(name);
        scr.close();  // to close the stream
    }
    
}
