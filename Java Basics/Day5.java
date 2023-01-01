import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        // Nov 11, 2022
        //Condition and loops
        // Ques1
        // int day=2;
        // if(day ==7){
        //     System.out.println("Today is Holiday");
        // }
        // else{
        //     System.out.println("Working day!");
        // }

        // Ques2
        // Two no is given, which no is greater
        // int a=10, b=20;
        // if(a>b){
        //     System.out.println("A is greater");
        // }
        // else{
        //     System.out.println("B is greater");
        // }

        //Ques3
        //Even Odd
        // int a = 10;
        // if(a%2 == 0){
        //     System.out.println("No is even");
        // }
        // else{
        //     System.out.println("No is odd");
        // }

        //Ques4
        //Scanner is a predefined ApI
        // DL apply or not
        // Maven is the area in which java classes are defined
        // Scanner scr = new Scanner(System.in);
        // int age = scr.nextInt();
        // if(age>=18){
        //     System.out.println("You can apply for DL");
        // }
        // else{
        //     System.out.println("Sorry, Not eligible to apply");
        // }
        // scr.close();

        //Ques5
        //Leap Year
        // System.out.println("Enter the year");
        // Scanner scr = new Scanner(System.in);
        // int year = scr.nextInt();
        // if(year %4 ==0){
        //     System.out.println("Year is leap year");
        // }
        // else{
        //     System.out.println("Year is not a leap year");
        // }
        // scr.close();

        //Ques6
        // profit and loss
        // System.out.println("Enter the cost Price for Mobile phone");
        // Scanner scr = new Scanner(System.in);
        // int cp = scr.nextInt();
        // System.out.println("Enter the selling price");
        // int sp = scr.nextInt();
        // int p = sp-cp;
        // if(p>0){
        //     System.out.println("Profit" +p);
        // }
        // else{
        //     System.out.println("loss" +p);
        // }
        // scr.close();

     
        // Multiple if else
        System.out.println("1. Drinks");
        System.out.println("2. Snacks");
        System.out.println("3. Sweets");
        System.out.println("Enter the choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println(" Maaza");
        } else if(choice == 2){
            System.out.println(" French fries");
        } else if(choice == 3){
           System.out.println("Chocolates");
        } else{
            System.out.println("Wrong choice");
        }
        sc.close();

    }
    
}
