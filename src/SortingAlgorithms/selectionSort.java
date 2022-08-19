package SortingAlgorithms;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr ={2,3,45,2,1,78,53};
        selectionSort(arr);
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int [] arr){
        for(int i =0 ;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx= j;

                }
            }
            int temp =arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]= temp;
        }
    }
}
