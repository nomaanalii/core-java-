class A {
    int a = 5 ;
    static {
        A instance = new A(); 
        System.out.println("Accessing instance variable inside static block: " + instance.a);
    }
}

public class StaticAssigment11 {
    public static void main(String[] args) {
        A k = new A();

    }
    
}
