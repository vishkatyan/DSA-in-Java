public class RecursionFibonacciSeries {
 // Fibonacci Series --> 0 1 1 2 3 5 8 13 21......n
     static int fib(int n) {
         if(n==0)
             return 0;
         if(n==1)
             return 1;
         int res= fib(n-1)+fib(n-2);
         return res;

     }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
