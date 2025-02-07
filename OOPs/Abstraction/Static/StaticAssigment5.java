abstract class A {
    class B {
        void show(){
            System.out.println("Method inside class inside abstract class");
        }
    }
}
class C extends A {

}
public class StaticAssigment5 {
    public static void main(String[] args) {
        A k = new C();
        A.B p = k.new B();
        p.show();
    }
    
}
