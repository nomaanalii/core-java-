public class ps8 {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10};
        int mid = (a.length-1)/2;
        int extra = a[mid];
        a[mid]=a[0];
        a[0]=extra;

        int z = a[mid+1];
        a[mid+1]= a[a.length-1];
        a[a.length-1]=z;

         
        for (int i =0 ; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }

    }    
}
