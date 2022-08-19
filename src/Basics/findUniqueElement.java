package Basics;

public class findUniqueElement {
    public static void main(String[] args) {
        int [] array = {1,2,3,1,4,5,3,5,4};
        System.out.println("Unique element in array is "+uniqueElement(array));
    }
    //BruteForce
    public static int uniqueElement (int [] arr ){
        for(int i =0 ;i<arr.length;i++){
            for(int j=0 ;j<arr.length;i++){
                if(arr[i]!=arr[j] && i!=j){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
