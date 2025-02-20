import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        String [] a = new String [10];
        Scanner sc = new Scanner (System.in);
        int count = 0;
        for ( int i = 0 ; i<a.length ; i++){
            System.out.println("Enter the name ");
            a[i]= sc.nextLine();
            
        }
        for ( int i = 0 ; i<a.length ; i++){
            if (a[i].equals("apple")){
                count++;
            }
        }
        System.out.print("Total number of apples in string is ");
        System.out.println(count);

    }
}
