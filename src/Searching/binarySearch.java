package Searching;

public class binarySearch {
    //Condition for BinarySerarch is Array must be sorted
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6};
        System.out.println("Element is Present at " + binarySearch(arr,5));
    }
    public static int binarySearch(int [] arr ,int x){
        int start =0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end -start)/2; //for interger overflow
            if(arr[mid]==x){
                return mid;

            }
            else if(arr[mid]>x){
                end =mid-1;

            }
            else {
                start= mid+1;
            }
        }
        return -1;
    }
}
