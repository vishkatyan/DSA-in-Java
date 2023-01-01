import java.util.Scanner;

public class Vowel_consonant {
    public static void main(String[] args) {
        System.out.println("Enter character to check vowel and consonant");
        Scanner scr = new Scanner(System.in);
        char c = scr.next().charAt(0);
        if(c=='a' || c=='A'|| c=='e' || c=='E'|| c== 'i' || c=='I' || c== 'o' || c== 'O' || c== 'u' || c== 'U'){
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is consonant");
        }
    }
    
}
