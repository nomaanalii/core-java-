import java.util.*;

public class ps1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        if(age >18){
            System.out.println("You are eligible for voter Id ");
        }
        else {
            System.out.println("You are not eligible for voter ID");
        }
    }

}
