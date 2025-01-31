
// 10)if the inpute is the integer then check ,check number 7 or 3 k multiple se divisible hey kya 

import java.util.Scanner;

public class ps10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        if (a%(7*3)==0){
            System.out.println("The number is divisible by multiple of both 7 and 3");
        }
    
        else {
            System.out.println("The number is not divisible by multiple of the number ");
        }


    }
}
