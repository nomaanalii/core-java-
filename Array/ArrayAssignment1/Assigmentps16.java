

public class Assigmentps16 {
    public static void main(String[] args) {
        int a []= {123,567,453,678 ,876};
        
        for(int i = 0 ; i < a.length ; i++){
            int first = a[i];
            int second = 0 ;


            while (first!= 0){
                
                int digit = first % 10 ;
                second = second *10 + digit;
                first = first/10;
            }
            System.out.println(second);
        }

    }
    
}
