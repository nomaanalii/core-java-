abstract class A {
    abstract void show1();
    abstract void show2(int a);
    abstract int show3();
    abstract String show4(String name);
}
class B extends A {
    void show1(){
        System.out.println("Hello");
    }
    void show2(int a){
        System.out.println(""+a);
    }
    int show3(){
        int c = 45;
        System.out.println(""+c);
        return c;
        
    }
    String show4(String name){
        System.out.println(""+name);
        return name;
    }
    
}

public class Abstraction1{
    public static void main(String[]args){
        B k = new B();
        k.show1();
        k.show2(10);
        k.show3();
        k.show4("john");
    }
}