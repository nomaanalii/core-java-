public class Assigmentps7 {
    public static void main(String[] args) {
        int a []= {12,67,46,435,67,385,33,335,34,23};
        for (int i = 0 ; i < ((a.length/2)); i++){
            System.out.print(" " + a[i]);
        }
        for (int i = (a.length -1) ; i >= ((a.length+1)/2); i--){
            System.out.print(" " + a[i]);
        }
    }
    
}
