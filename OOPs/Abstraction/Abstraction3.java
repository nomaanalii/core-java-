
abstract class A {
    A(int a ){
        System.out.println("A Constructor "+a);
    }
}
abstract class B{
    B(int b){
        System.out.println("B Constructor "+b);
    }
}
class C extends A{
    C(){
        super(10);

    }
}
class D extends B{
    D(){
        super(12);
        
    }

}

public class Abstraction3 {
    public static void main(String[] args) {
        C k = new C();
        D p = new D();


    }
    
}
