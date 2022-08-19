package Basics;

public class LargestInArray {
    public static void main(String[] args) {
        int []  array ={10,2,35,344};
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max element in array is "+ max);
    }
}
