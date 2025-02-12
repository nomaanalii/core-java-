public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[2]= 78;
        System.out.println(a[2]+" "+a[3]);
        System.out.println(a[5]);// Index 5 out of bounds for length 5 Error
    }
}