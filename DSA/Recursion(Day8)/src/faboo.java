public class faboo {
    public  static int fib(int a ,int b, int n) {
         if (n == 1) {
             return 1;
         }
        if (n == 0) {
            return 0;
        }

        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);
        return c;

    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(fib(a,b,5));
    }
}
