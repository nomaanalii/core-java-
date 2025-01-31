// 15)
// char match 
// a =>apple 
// b :ball 
// c :cat 
// not match 
import java.util.*;
public class ps15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character ");
        char a = sc.next().charAt(0);

        switch (a){
            case 'a':
                    System.out.println("Apple");
                    break;
            case 'b':
                    System.out.println("Ball");
                    break;
            case 'c':
                    System.out.println("Cat");
                    break;
            case 'C':
                    System.out.println("Cat");
                    break;
            case 'B':
                    System.out.println("Ball");
                    break;
            case 'A':
                    System.out.println("Apple");
                    break;
            default :
                    System.out.println("Invalid input");
        }
    }
    
}
