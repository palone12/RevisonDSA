package Basics;

public class intersectionTwoArrays {
    public static void main(String[] args) {
        int array1 [] = {1,2,3,4,5};
        int array2 [] = {2,3,6,4};
        for(int i =0 ;i< array1.length ;i++){
            for(int j=0 ;j< array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.print(array1[i] +" ");
                    array1[i] =Integer.MIN_VALUE;
                }
            }
        }
    }
}
