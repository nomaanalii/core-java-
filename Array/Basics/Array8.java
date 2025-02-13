// Traget sum of two numbers pair 
// target 
// Suppose you have an array now check the sum of two numbers which are equal to target and
//you can decide the target . 


public class Array8{

    public static void main(String[] args) {
         
        int a [] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i <a.length ; i++){
            int target = 9 ;

            for (int j = i+1 ; j < a.length; j++ ){
                if(a[i]+a[j]==target){
                    System.out.println( a[i] + " and " + a[j]);
                }
            }
        }

        }

}