package SortingAlgorithms;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,4,7,4,6};
        insertionSort(arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.print((arr[i]+" "));
        }

    }
    public static void  insertionSort(int [] arr){
        int n = arr.length;
        for(int i=1 ;i<n ;i++){
            int j=i-1;
            int temp =arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1] =temp;

        }
    }
}
