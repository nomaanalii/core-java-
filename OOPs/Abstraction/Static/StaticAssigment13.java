

class A{
    A(){
        
    }
    static{
        System.out.println("Static block a ");

    }
}
class B extends A {
    B(){

    }
    static{
        System.out.println("Static block b ");
    }
}
class C extends B{
    C(){

    }
    static{
        System.out.println("Static block c ");
    }
}
class D extends C{
    D(){

    }
    static{
        System.out.println("Static block D ");
    }

}
public class StaticAssigment13 {
    public static void main(String[] args) {
        new D();
    }
    
}
