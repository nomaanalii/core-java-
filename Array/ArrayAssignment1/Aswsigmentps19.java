public class Aswsigmentps19 {
    public static void main(String[] args) {
        int a[]={123,8675,6434,7657,8766 };
        for (int i = 0 ; i <a.length ; i++){
        int h = a[i];
        int sum =0;

        while (h>0){
            int num = h%10;
            if(num%2!=0){
                sum= sum + num;
            }
            h = h/10;
        }
        System.out.println(sum);

        }
    }
}
