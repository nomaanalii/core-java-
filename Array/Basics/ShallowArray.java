
// Shallow copy 

public class ShallowArray {
    public static void printArray(int a[]){
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]= {45,56,78,98};
        
        int b[]= a;
        a[0]=1;
        a[1]=2;
        printArray(b);
        printArray(a);
    }
}
