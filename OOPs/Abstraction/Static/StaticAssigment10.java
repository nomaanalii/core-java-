interface B {
    private void show1(){
        System.out.println("private interface ");
    }
    default void show2(){
        System.out.println("default interface ");
    }
    static void show3(){
        System.out.println("Static interface ");
    }
    default void show4(){
        show1();
    }
}
class A implements B {

}
public class StaticAssigment10 {
    public static void main(String[] args) {
        A k = new A();
        k.show2();
        B.show3();
        k.show4();
}
}
