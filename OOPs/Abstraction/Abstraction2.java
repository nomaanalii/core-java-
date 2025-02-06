
abstract class A {
    A(){
        System.out.println("A Constructor");
    }
}
abstract class B{
    B(){
        System.out.println("B Constructor");
    }
}
class C extends A{

}
class D extends B{

}

public class Abstraction2 {
    public static void main(String[] args) {
        C k = new C();
        D p = new D();

    }
    
}
