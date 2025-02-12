// print array using method 

public class Array5 {
    public static void printn(int a[]){
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]= {45,56,78,98};
        printn(a);
    }
}
