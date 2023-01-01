import java.beans.beancontext.BeanContextSupport;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // create constants by using keyword final with capital alphabets
        // always declare constants in capital case.
        final int DRINKS= 1;
        final int SWEETS = 2;
        final int SNACKS = 3;
        System.out.println("Your choice");
        int choice = scr.nextInt();
        switch(choice)
        {
            case DRINKS:
            System.out.println("Drinks Pepsi");
            break;

            case SWEETS:
            System.out.println("Chocolate");
            break;

            case SNACKS:
            System.out.println("Chips");
            break;




        }


    }
    
}
