class A {
    static class B{
        int show(){
            int a = 5 ;
            System.out.println(""+a);
            return a;
        
    }
    
    }
    class C{
        int show2(int a ){
            System.out.println("Entered number is "+a);
            return a ;

        }
    }

}

public class StaticAssigment8 {
    public static void main(String[] args) {
        A k = new A();
        A.B p = new A.B();
        p.show();
        A.C t = k.new C();
        t.show2(10);
    }
    
}
