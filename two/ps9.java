// 9)uper case and lower case input by user 
import java.util.*;
public class ps9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the charactewr ");
        char a = sc.next().charAt(0);

        if ( Character.isUpperCase(a)){
            System.out.println("The Character is upper case ");
        }
        else {
            System.out.println("The character is Lower Case ");
        }
    }    
}
