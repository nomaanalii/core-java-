public class Assigmentps20 {
    
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'e', 'x', 'i', 'o', 'u', 'c', 'y'};
        for ( int i = 0 ; i < a.length ; i++){
            if (a[i]!='a'&& a[i]!='e'&& a[i]!='i'&& a[i]!='o'&& a[i]!='u'){
                System.out.println("THIS ALPHABET IS ALPHABET " + a[i]);
            }
        }
    }

}
