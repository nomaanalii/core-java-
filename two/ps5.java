// 5)five number max abcde
import java.util.*;
public class ps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();

        System.out.println("Enter the number ");
        int b = sc.nextInt();


        System.out.println("Enter the number ");
        int c = sc.nextInt();


        System.out.println("Enter the number ");
        int d = sc.nextInt();


        System.out.println("Enter the number ");
        int e = sc.nextInt();

        if (a>b && a>c && a>d && a>e ){
            System.out.println(a + " is the greatest number among all.");
        }

        else if (b>a && b>c && b>d && b>e ){
            System.out.println(b + " is the greatest number among all.");
        }

        else if (c>b && c>a && c>d && c>e ){
            System.out.println(c + " is the greatest number among all.");
        }

        else if (d>b && d>a && d>c && d>e ){
            System.out.println(d + " is the greatest number among all.");
        }
        
        else {
            System.out.println(e + " is the greatest number among all.");
        }

    }
    
}
