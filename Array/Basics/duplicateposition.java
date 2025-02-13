public class duplicateposition {
    public static void main(String[] args) {
        int a []={1,2,3,4,5,2,6,2,7,8,2,9};
        int target = 2 ;
        for (int i = 0 ; i <a.length ; i++){
            for (int j = i+1 ; j<a.length ; j++){
                if(a[i] == a[j]){
                    System.out.println(j);
                }
            }
        }

        
    }
    
}
