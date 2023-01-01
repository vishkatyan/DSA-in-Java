public class SumOfEvenOddDigitByRecursion {
    static int EvenOdd(int arr[], int size, int even, int odd){
        if(size==0 || size==1)
            return 0;
        for(int i=0;i<size;i++){
            if(arr[size-1] %2==0)
                even += (arr[size-1]);
            else
                odd+=(arr[size-1]);
        }

        return EvenOdd(arr, size-1,even,odd);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(EvenOdd(arr,arr.length,0,0));

    }
}
