class A {
    private void show(){
        System.out.println("Private method inside outer class");
    }
    class B {
        private void show2(){
            System.out.println("private method inside inner class");

        }
        void show3(){
            show2();
        }
    }
    void show4(){
        show();
    }
}
public class StaticAssigment3 {
    public static void main(String[] args) {
       A k = new A();
       k.show4(); 
       A.B p = k.new B();
       p.show3();
    }
}
