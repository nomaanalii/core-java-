
import java.util.*;
public class ps3{

    public static void main(String[] args) {
        char [] a = new char [10];
        Scanner sc = new Scanner (System.in);
        int vowel= 0;
        int countC = 0;
        for ( int i = 0 ; i<a.length ; i++){
            System.out.println("Enter the char ");
            a[i]= sc.next().charAt(0);
        }
        for (int i = 0 ; i <a.length ; i++){
            
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ){
                vowel++;
            }
            else{
                countC++;

            }
        }
        System.out.print("Total number of vowel is ");
        System.out.println(vowel);
        System.out.print("Total number of consonent is ");
        System.out.println(countC);
        if(vowel > countC){
            System.out.println("vowel is max "+ vowel);
        }
        else {
            System.out.println("consonent is max "+ countC);
        }
    }


} 