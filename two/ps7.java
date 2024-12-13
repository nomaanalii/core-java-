// 7) vowel and consonat 
// ->a e i o u vowel 
// consonant 
import java.util.*;
public class ps7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char a = sc.next().charAt(0);

        if (a=='a' || a == 'e' || a=='i' || a =='o' || a =='u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            System.out.println(a + " : Is vowel");
        }
        else {
            System.out.println(a + " : Is consonent");
        }
    }
    
}
