import java.util.Scanner;

public class IsUpperCase {
    public static void main(String[] args) {
        System.out.println("Enter any character to check");
        Scanner scr = new Scanner(System.in);
        char c = scr.next().charAt(0);
        // if(Character.isLowerCase(c))
        if(c>=97 && c<=122)
        {
            System.out.println("Character is in Lower Case");
        }
        // else if(Character.isUpperCase(c))
        else if(c>=65 && c<=90)
        {
            System.out.println("Character is in Upper Case");
        }
        

        
    }

    
    
}
