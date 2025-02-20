import java.util.*;
public class ps2 {
    public static void main(String[] args) {
        char [] a = new char [10];
        Scanner sc = new Scanner (System.in);
        int vowel= 0;
      
        for ( int i = 0 ; i<a.length ; i++){
            System.out.println("Enter the char ");
            a[i]= sc.next().charAt(0);
        }
        for (int i = 0 ; i <a.length ; i++){
            
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ){
                vowel++;
            }
        }
        System.out.print("Total number of vowel is ");
        System.out.println(vowel);
    }
}