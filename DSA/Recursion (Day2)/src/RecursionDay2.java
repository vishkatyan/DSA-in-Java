public class RecursionDay2 {
    // Recursion function with return type
//    static int countDigit(int num, int count){  //num is local variable
//        if(num==0){
//            return count;
           //  }
    //       int r =countDigit(num/10,count+1);
//        return r;
//        }

    // Another approach
    static int countDigit(int num){ //num is local variable
        if(num==0){
            return 0;
        }
        return 1+ countDigit(num/10);

    }
    public static void main(String[] args) {
        System.out.println(countDigit(131209));
//        int e =countDigit(131209);
//        System.out.println(e);
    }
}
