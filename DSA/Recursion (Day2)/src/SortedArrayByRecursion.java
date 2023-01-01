public class SortedArrayByRecursion {
    // Ques 1 --> Check whether array is sorted or not
    static boolean searchElementInArray(int arr[], int size){
        // base case
        if(size==0 || size==1){
            return true;
        }
        if(arr[size-1]<=arr[size-2])
            return false;
        boolean isSmallerArray = searchElementInArray(arr,size-1);
        return isSmallerArray;
    }
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5};
        System.out.println(searchElementInArray(arr, arr.length));


    }
}
