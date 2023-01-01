public class Day3 {
    static int countDigit(int num, int count){
        if(num==0)
            return count;
        return countDigit (num/10,count+1);
    }
    public static void main(String[] args) {
        System.out.println(countDigit(12345,0));
    }
}
