
import java.util.Scanner;

public class ps16 {
    public static void main(String[] args) {
        int a []= new int[5];
        int b [] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<a.length;i++){
            System.out.println("Enter element of 1st array ");
            a[i]=sc.nextInt();
           } 
        for(int i = 0;i<b.length;i++){
            System.out.println("Enter element of 2nd array ");
            b[i]=sc.nextInt();
       } 
        int suma = 0;
        int sumb = 0;
       
        for (int i = 0 ; i<a.length ; i++){
            suma = suma +   a[i];
            
        }
        for (int i = 0 ; i<b.length ; i++){
            
            sumb = sumb + b[i];
            
        }
        System.out.println(suma);
        System.out.println(sumb);
        if(suma>sumb){
            System.out.println("The array one sum is bigger ");
        }
        else{
            System.out.println("The array two sum is bigger ");
        }
    }
}

