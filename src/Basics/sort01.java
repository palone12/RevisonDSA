package Basics;

public class sort01 {
    public static void main(String[] args) {
        int [] arr ={1,0,1,0,0,1};
        int start=0 ;
        int end = arr.length-1;
        int i=0;
        while(i<end){
            if(arr[i]<1){
                int temp =arr[start];
                arr[start] =arr[i];
                arr[i] =temp;
                start++;
            }
            i++;
        }
        for(int j=0 ;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
