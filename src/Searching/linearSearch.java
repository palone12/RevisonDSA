package Searching;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  [] arr = {1,2,33,55,232,565};
        int elementToFind =sc.nextInt();
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==elementToFind){
                System.out.println("Element is present at  "+ i);
                return ;
            }
        }
    }
}
