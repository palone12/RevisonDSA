package Basics;

public class findDuplicate {
    public static void main(String[] args) {
        int arr [] ={0 ,3 ,1 ,5 ,4 ,3 ,2};
        System.out.println("Duplicate Element present in array is " + duplicateElement(arr));
    }
    //brute force  TimeComplexity -- O()
    public static int  duplicateElement (int []arr){
        for(int i =0 ;i<arr.length;i++){
            for(int j=0 ;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
