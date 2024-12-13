// package Assignment2;
// 8)divisible 5 and 11 
// 	a)num dono se divide ho jb process ho 
// 	b)num kisi se bhi divide ho jb process ho

import java.util.*;
public class ps8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        if (a%5==0 && a%11==0){
            System.out.println("The number is divisible by both 5 an 11");
        }
        else if (a%5==0 || a%11==0){
            System.out.println("The number is divisible by either 5 or 11");
        }
        else {
            System.out.println("The number is not divisible by any of them");
        }


    }
    
}
