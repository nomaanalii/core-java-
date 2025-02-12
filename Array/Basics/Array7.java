public class Array7 {
    public static void main(String[] args) {
        int a[]={1,2,3,5,4};
        int max =a[0];  //0 se intialize nhi krna h negative value will trouble the question 
        for(int i = 0 ; i <a.length ; i++){
            if(max<=a[i]){
                max = a[i] ;
            }
        }
        System.out.println( " Maximum number is "+ max );

    }
    
}
