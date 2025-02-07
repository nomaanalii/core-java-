class A {
    static class B {
        int show(int a) {
            System.out.println(a);
            return a;
        }

        static B show2() {
            return new B();
        }
    }
}

class C extends A.B {
   
    static C show2() { 
        System.out.println("Static covariant method");
        return new C();
    }
}

public class StaticAssignment7 {
    public static void main(String[] args) {
    
        A.B p = new A.B();
        p.show(5);

        C k = new C();
        k.show2();
    }
}
