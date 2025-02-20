import java.util.*;
public class ps1{

    public static void main(String[] args) {
        String [] a = new String [5];
        Scanner sc = new Scanner (System.in);
        int count = 0;
        for ( int i = 0 ; i<5 ; i++){
            System.out.println("Enter the name ");
            a[i]= sc.nextLine();
            count++; 
        }
        System.out.print("Total number of names in string is ");
        System.out.println(count);

    }


} 