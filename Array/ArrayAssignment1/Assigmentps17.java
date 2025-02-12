// 123,567,453,678 ,876

// every element k digit ka sum :123=>6 
// even number

public class Assigmentps17 {
    
    public static void main(String[] args) {
        
        int a []={123,567,453,678 ,876};

        for (int i = 0 ; i <a.length ; i++){
            int digit = a[i];
            int digitSum = 0 ;
            while (digit >0){
                int num = digit%10;
                digitSum = digitSum + num ;
                digit = digit/ 10 ;
            }
            System.out.println(digitSum);
        }

    }

}
