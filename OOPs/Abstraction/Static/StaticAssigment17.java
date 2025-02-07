class A{
    static int a = 5;
    static void show (){
        A k = new A();
        System.out.println(""+k.a);
    }
}
public class StaticAssigment17 {
    public static void main(String[] args) {
        A k = new A();
        k.show();
    }
}
