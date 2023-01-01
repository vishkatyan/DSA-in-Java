import java.util.Scanner;

public class Practice_if_else {

    // Ques1
    // checking for alphabets

    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner scr = new Scanner(System.in);
         char c = scr.next().charAt(0);
        if(c>=65 && c<=90 || c>=97 && c<=122){
            System.out.println("Alphabet");
        } // check for digits
        else if(c>=48 && c<=57){
            System.out.println("Numbers");
        } 
        else{
            System.out.println("Special characters");
        }

    }

        


        

         
        
    
    
}
