import java.util.Scanner;

public class ps19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int [5];
        for (int i = 0 ; i <a.length ; i++){
            a[i]=sc.nextInt();
        }
        int z = a[0];
        for (int i = 0 ; i<a.length ; i++){
            if(a[i]>z){
                z=a[i];
            }
        }
        boolean Prime = true;

        if (z <= 1) {
            Prime = false; 
        } else {
            for (int i = 2; i <= z / 2; i++) { 
                if (z % i == 0) {
                    Prime = false;
                    break; 
                }
            }
        }
        if(Prime == true ){
            System.out.println("Highest number is prime ");
        }
        else{
            System.out.println("not prime");
        }
        
    }
}
