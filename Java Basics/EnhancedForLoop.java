import java.util.Locale;
import java.util.Scanner;
public class EnhancedForLoop {
    public static void main(String[] args) {
//        int x[] ={1,2,3,4,5};
//        for(int i:x){
//            System.out.println(x[i]);
//        }
//        String arr[]={"Hello", "World", "vishakha"};
//        for(String i: arr){
//            System.out.println(i);
//        }

        //Example to practice
        // convert the string into title case means capital each first character of a word
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scr.nextLine();
//        System.out.println(name);
        String nameArray[] = name.split(" ");
        for(String i:nameArray){
//            System.out.println(i);
//            String n = String.valueOf(i.charAt(0)).toUpperCase() + i.toLowerCase();

        }
        String s0 = nameArray[0];
        String s1 = nameArray[1];
        String s2 = nameArray[2];
        String sub0 = s0.substring(1);
        String sub1 = s1.substring(1);
        String sub2 = s2.substring(1);
        System.out.println(String.valueOf(s0.charAt(0)).toUpperCase() + sub0.toLowerCase());
        System.out.println(String.valueOf(s1.charAt(0)).toUpperCase() + sub1.toLowerCase());
        System.out.println(String.valueOf(s2.charAt(0)).toUpperCase() + sub2.toLowerCase());
        scr.close();

//        First convert to lower case then split it , and use ascii value, the difference between capital and small are 32
    }
}
