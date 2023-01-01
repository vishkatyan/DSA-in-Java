import java.util.Scanner;

public class SayDigits {
    static void saydigit(int n,String arr[]){
        if(n==0)
            return;
        int digit= n%10;
        saydigit(n/10,arr);
        System.out.println(arr[digit]);

    }
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner scr = new Scanner(System.in);
        int n= scr.nextInt();
        String arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        saydigit(n,arr);
    }
}
