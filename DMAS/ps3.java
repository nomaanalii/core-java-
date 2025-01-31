import java.util.Scanner;

public class ps3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the 1st number ");
        float a = sc.nextFloat();

        System.out.println("Enter the value of the 2nd number ");
        float b = sc.nextFloat();

        System.out.println("Enter the value of the 3rd number ");
        float c = sc.nextFloat();

        System.out.println("Enter the value of the 4th number ");
        float d = sc.nextFloat();

        System.out.println("Enter the value of the 5th number ");
        float e = sc.nextFloat();

        System.out.println("Enter the value of the 5th number ");
        float f = sc.nextFloat();

        float g = a+b*(c-d)/e+f;

        

        System.out.println("Value after Evaluation is "+g);

    
}
}
