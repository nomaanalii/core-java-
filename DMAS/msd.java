import java.util.*;
public class msd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the first number ");
        float a = sc.nextFloat();

        System.out.println("Enter the value of the second number ");
        float b = sc.nextFloat();

        System.out.println("Enter the value of the third number ");
        float c = sc.nextFloat();

        System.out.println("Enter the value of the fourth number ");
        float d = sc.nextFloat();

        float e = a*b-c/d ;

        System.out.println("Your value after all the evaluation is "+e);

    }
    
}
