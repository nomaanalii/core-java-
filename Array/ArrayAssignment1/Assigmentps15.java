public class Assigmentps15 {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10};  
        for (int i = 0 ; i < a.length; i++){
            for (int x = 1 ; x <= 10 ; x++){
                int product = x*a[i];
                System.out.print(" " + product);
            }
            System.out.println();
        }
      }
}
