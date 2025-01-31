//a ya b dono mey se bda konsa hey 
import java.util.*;
public class ps3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a+" is bigger than "+b);
        }
        else {
            System.out.println(b+" is bigger than "+a);
        }
    }
    
}
