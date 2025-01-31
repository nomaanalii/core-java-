// 14 )user number 
// check number :even odd 
import java.util.*;
public class ps14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number ");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("The entered nmber is even");
        }
        else {
            System.out.println(":Enterred number is odd ");
        }
    }
    
}
