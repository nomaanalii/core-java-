

class A {
    abstract class B {
        abstract void show();
        void show2(){
            System.out.println("non abstract method");
        }
    }
    class C extends B{
        void show(){
            System.out.println("Abstract method inside abstract class ");

        }
    }
}
public class StaticAssigment4 {
    public static void main(String[] args) {
        A k = new A();
        A.C p = k.new C();

        p.show();
        p.show2();
    }
    
}
