//check weater the value is present in the arrau or not 

public class Array6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int target = 3 ;
        for ( int i = 0 ; i < a.length ; i++){
            if (a[i]== target){
                System.out.println("Present"+ " At location " +i);
            }
        }
    }
}
