public class ps7 {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10};
        int b = a[0];
         a [0]=a[9];
         a[9]=b;
        for (int i =0 ; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }

    }    
}
