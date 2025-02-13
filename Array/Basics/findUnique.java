
public class  findUnique {

    public static void main(String[] args) {
        
        int a []={1,2,3,4,1,6,2,3}; 
        int count = 0 ;
        for ( int i = 0 ; i <a.length ; i++){
            count = 0;
            for(int j = 0; j < a.length ; j++){
                if(a[i]==a[j]){
                    count++;
                }
                
                
            }
            if (count == 1 ){
                System.out.println(a[i]);
            }
        }  
        
        //another concept 

        for (int i = 0 ; i<a.length ; i++){
            for (int j = i+1 ; j<a.length ; j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                    a[i]=-1;
                }
            }
        }

        for(int i = 0 ; i<a.length ; i++){
            if(a[i]>0){
                System.out.println(a[i]);
            }
        }
    }
    
}
