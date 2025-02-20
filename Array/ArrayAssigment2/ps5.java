public class ps5 {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6};
        int b [] ={1,2,3,4,5,6};
        int suma = 0;
        int sumb = 0;
       
        for (int i = 0 ; i<a.length ; i++){
            suma = suma +   a[i];
            
        }
        for (int i = 0 ; i<b.length ; i++){
            
            sumb = sumb + b[i];
            
        }
        System.out.println(suma);
        System.out.println(sumb);
    }
}
