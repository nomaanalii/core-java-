public class ps11 {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,};
        int firsteven = 0 ; 
        int lasteven = 0 ;
        for (int i =0 ; i<a.length ; i++){
            if(a[i]%2==0){
                if(firsteven == 0){
                    firsteven = i;
                }
                lasteven = i;
            }
        }
        System.out.println("First even number is " + firsteven);
        System.out.println("First last number is " + lasteven);
    }
}
