//1,2,3,2,1,4,6,3,2,4 
public class ps14 {
    public static void main (String[]args){
        int a[]={1,2,3,2,1,4,6,3,2,4 };
        int count = 0 ;
        for (int i =0 ; i<a.length ; i++){
            int t = 2;
            if (a[i]== t) {
                count++;
            }
        }
        if(count>1){
            for (int i =0 ; i<a.length ; i++){
                int t = 2;
                if (a[i]== t) {
                    System.out.println("target is present at index " + i);
                }
            }
        }
        System.out.println("total duplicate " + count);
    }
}
