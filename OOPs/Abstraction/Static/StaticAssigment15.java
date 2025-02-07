class A {
    static {
        System.out.println("Static block  ");
    }
    static {
        System.out.println("Static block  ");
    }
    static void show() {
        System.out.println("method call 1  ");
    }
    static void show2() {
        System.out.println("method call 2  ");
    }
    static void show3() {
        System.out.println("method call 3  ");
    }

    static void show4() {
        System.out.println("method call 4  ");
    }


}

public class StaticAssigment15 {
    public static void main(String[] args) {
        A k = new A();
        k.show();
        k.show2();
        k.show3();
        k.show4();
        
        new A();
    }
    
}
