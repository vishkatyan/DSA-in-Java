public class Printing {
    //print
//    5
//    3
//    1
//    2
//    4
    static void Digit(int num){
        if(num==0)
            return;
        else if(num%2!=0)
            System.out.println(num);
        Digit(num-1);
        if(num%2==0)
            System.out.println(num);

    }
    public static void main(String[] args) {
    Digit(5);
    }
}
