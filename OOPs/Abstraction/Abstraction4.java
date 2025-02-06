abstract class A {
    private void show (){
        System.out.println("Private method Inside abstract class");
    }
    void show3 (){
        show();
    }
    protected void show2 (){
        System.out.println("Protected method Inside abstract class");
    }

}
class B extends A {

}
public class Abstraction4 {
    public static void main(String[] args) {
        A k = new B();
        k.show3();
        k.show2();
        
    }
    
}
