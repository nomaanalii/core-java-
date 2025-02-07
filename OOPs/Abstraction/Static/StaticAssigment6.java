class A {
    static class B {
        void show(){
            System.out.println("method inside static class inside class ");

        }
    }
}
public class StaticAssigment6 {
    public static void main(String[] args) {
        A.B p = new A.B();
        p.show();
    }
    
}
