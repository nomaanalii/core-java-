class A {
        class B {
                int show (int a ){
                    System.out.println(""+a);
                    return a;
                }
                int show2 (int b ){
                    System.out.println(+b);
                    return b;
                }
                

        }
        class C extends B {
            int show (int b){
                
            }
        }
}
public class StaticAssigment1{
    public static void main(String[] args) {
        A p = new A();
        A.B K = p.new B();
        K.show(5);
    }
}