class A {
    abstract class B {
        void show(){
            System.out.println("No return no argument ");
        }
    }
    static class C {
        void show2 (int a ){
            a = 5;
            System.out.println("no return argument "+a);
        
        }
    }
    interface D {
         default int show3(){
            System.out.println("Interface default method");
            return 3;
         }
    }
    class E {
        int show4(int a ){
            System.out.println("Interger valuew"+a);
            return a;
        }
    }
    
}

public class StaticAssigment9 {
    public static void main(String[] args) {
        A k = new A();
        A.B p = k.new B(){
    
        void show() {
            super.show();
        }
    };
        p.show();
        A.C t = new A.C();
        t.show2(5);
        A.D f = new A.D(){};
        f.show3();
        A.E g = k.new E();
        g.show4(5);
    }
    
}
