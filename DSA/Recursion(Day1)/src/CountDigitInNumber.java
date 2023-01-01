public class CountDigitInNumber {
    static void countDigit(int num, int count){
        // termination case
        if(num==0){
            //processing line
            System.out.println(count);
            return;
        }
        // small problem
        countDigit(num=num/10,count+1);
    }
    public static void main(String[] args) {
        countDigit(12345,0);
    }
}
