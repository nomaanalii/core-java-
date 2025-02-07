class A {
    static class B{
        B(){
            int a=5; 
            System.out.println(""+a);
        }
    }
}
public class StaticAssignment2 {
    public static void main(String[] args) {
       new A.B();
       new A.B();
       new A.B();
       new A.B();
        
    }
}
