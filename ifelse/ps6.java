// 6) user 
// -9 negative integer 
// 5 positive integer 
// 0 =zero 

import java.util.*;
public class ps6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuumber ");
        int a = sc.nextInt();

        if (a==0){
            System.out.println("Entered number is Zero");
        }
        else if (a>0){
            System.out.println(a + " is positive integer");
        }
        else {
            System.out.println(a + " is negative integer ");
        }
    }
    
}
