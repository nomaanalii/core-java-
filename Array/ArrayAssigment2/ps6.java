public class ps6 {
    public void show(int a[]){
        for (int i =0 ; i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b [] = {1,2,35,6,7};
        int c[] ={12,2,3,43,5};
        int e[] ={1,22,3,43,5};
        int d[] ={1,2,43,43,5};
        ps6 k = new ps6();
        k.show(a);
        k.show(b);
        k.show(c);
        k.show(d);
        k.show(e);
    }
    
}
