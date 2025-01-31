// 13) 
// number (WEEK DAYS)
// 1 =>sunday 
// 2 =>monday 
// 3 =>tuesday 
import java.util.*;
public class ps13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input");
        int a = sc.nextInt();

        switch(a){
            case 1 :
                    System.out.println("Monday");
                    break;
            case 2 :
                    System.out.println("Tuesday");
                    break;
            case 3 :
                    System.out.println("Wednesday");
                    break;
            case 4 :
                    System.out.println("Thrusday");
                    break;
            case 5 :
                    System.out.println("Friday");
                    break;
            case 6 :
                    System.out.println("Saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
                    break;
        }
    }
    
}
