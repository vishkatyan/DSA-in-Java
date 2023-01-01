import java.util.Scanner;

public class SearchElementInArrayRecursion {
    static int searchElement(int arr[], int element, int size){
        // base case
        if(size==0)
            return -1;
        if(arr[size] == element)
            return size;

        return searchElement(arr,element,size-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,15};
        System.out.println("Enter element to be searched");
        Scanner scr = new Scanner(System.in);
        int element = scr.nextInt();
        System.out.println(searchElement(arr,element,arr.length-1));
    }
}
