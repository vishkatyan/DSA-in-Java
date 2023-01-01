public class SumOfDigit {
    static int digitSum(int n,int sum){
        if(n==0)
            return sum;
        int digit= n%10;
        return digitSum(n/10,sum+digit);

    }
    public static void main(String[] args) {
        System.out.println(digitSum(12345,0));

    }
}
