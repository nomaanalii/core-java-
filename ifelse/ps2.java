import java.util.*;

public class ps2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for your  ");
        int num = sc.nextInt();

        if(num >10){
            System.out.println("One Number :"+num );
            System.out.println("Is greater than 10" );
        }
        else {
            System.out.println("One Number :"+num );
            System.out.println("Is not greater than 10" );
        }
    }
}
