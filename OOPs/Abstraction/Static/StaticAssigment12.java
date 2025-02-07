class A {
    static int b = 100;

    static {
        System.out.println("Accessing static variable: " + b);
    }
}

public class StaticAssigment12 {
    public static void main(String[] args) {
       A k = new A();
    }
} 
