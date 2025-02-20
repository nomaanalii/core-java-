import java.util.*;
public class ps17 {
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
        System.out.println(z);
    }
    
}
