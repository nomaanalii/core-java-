//user input in array
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the Size ");
       int size = sc.nextInt();
       int a[] = new int[size];

       // loop for input in array 
       for (int i = 0 ; i < size ; i++){
        a[i]=sc.nextInt();
       }

       // loop for output in array 
       for(int i = 0 ; i<size ; i++){
        System.out.print(a[i]+" ");
       }
    }
    
}
