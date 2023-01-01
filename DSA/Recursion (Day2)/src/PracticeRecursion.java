import java.util.Scanner;
public class PracticeRecursion {
    // Factorial
//    static int factorial(int n){
//        // Base Case
//        if(n==1){
//            return 1;
//        }
//        // Recursive Function/ Condition
//        return n*factorial(n-1);
//    }

    // Power of 2
//    static int powerOfTwo(int n){
//        // Base case
//        if(n==0)
//            return 1;
//        return 2* powerOfTwo(n-1);
//    }

    // Print counting
//    static void countDigit(int n){
//        if(n==0)
//            return;
//        System.out.println(n); // print n (n-1) ---5 4 3 2 1
//          countDigit(n-1);
//          //  System.out.println(n);  // will print 1 2 -----n
//    }

    // Armstrong Number
    static boolean armStrong(int num, int sum, int rem){
        if(num==1) {
            if (sum == rem) {
                return true;
            }
            return false;
        }
        return armStrong(num%10, sum+rem*rem*rem,num/10);
    }
    public static void main(String[] args) {
        // factorial
//        System.out.println("Enter a no to find factorial");
//        Scanner scr = new Scanner(System.in);
//        int var = scr.nextInt();
//        int result =factorial(var);
//        System.out.println(result);

        // Power of 2
//        System.out.println("Enter the power");
//        Scanner scr = new Scanner(System.in);
//        int result = scr.nextInt();
//        System.out.println(powerOfTwo(result));

        // Count Digit
//        System.out.println("Enter the digit to print in reverse order");
//        Scanner scr = new Scanner(System.in);
//        int r = scr.nextInt();
//        countDigit(r);

        // Armstrong Number
        System.out.println("Enter value to check Armstrong or not");
        Scanner scr= new Scanner(System.in);
        int num = scr.nextInt();
        boolean result = armStrong(num,0,num);
        if(result)
            System.out.println("Armstrong No");
        else
            System.out.println("Not an Armstrong No");


    }
}
