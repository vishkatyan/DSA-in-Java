public class PrimeNumber {
    static boolean isPrime(int n,int i){
        if(n%i==0)
            return false;
        if(i*i==n/2)
//        OR if(i==n/2)
            return true;
        return isPrime(n,i+1);
    }
    public static void main(String[] args) {
        System.out.println(isPrime(133,2));
    }
}
