import java.util.*;
public class ps15 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a[]=new int[10];
        for (int i =0 ; i<10 ; i++){
            System.out.print( "put Value ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target number ");
        int t ;
        t = sc.nextInt();
        for (int i =0 ; i<a.length ; i++){

            if (a[i]== t) {
                System.out.println("target is present at index " + i);
                
            }
        }
        int temp = t ;
        int r,sum=0  ;
        while(t>0){
        r = t%10;
        t = t /10;
        sum = sum + r*r*r; 
        }
        if(temp == sum ){
            System.out.println("its arm strong number ");
        }

    }
}
