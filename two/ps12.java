// 12)m =you are male
// f = female 
// other
import java.util.*; 
public class ps12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char a = sc.next().charAt(0);

        if (a =='m'){
            System.out.println("Male");
        }
        else if (a =='f'){
            System.out.println("Female");
        }
        else {
            System.out.println("Other ");
        }

    }
}
