package Basics;

public class pairSum {
    public static void main(String[] args) {
        int array [] ={1, 3, 6 ,2 ,5 ,4 ,3 ,2, 4};
        int sum =7;
        int count =0;
        for(int i =0 ;i<array.length;i++){
            for(int j=i+1 ;j<array.length;j++){
                if(array[i]+array[j]==sum  ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
