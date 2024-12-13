public class dowhileloop {

    public static void main(String[] args) {
        int a = 7 ;
        do { 
            a++;
            System.out.println(a);
        } while (a>=10);

        for ( int i = 1; i<=10;i++){
            if(i==6){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for ( int i = 1; i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    
}

