class A {
    static {
        System.out.println("Static block  ");
    }
    static {
        System.out.println("Static block  ");
    }
    static {
        System.out.println("Static block  ");
    }
    static {
        System.out.println("Static block  ");
    }


}

public class StaticAssigment14 {
    static {
        System.out.println("Static block a ");
    }
    public static void main(String[] args) {
       new A(); 
    }
}
