class A2 {

    void show1 (){
        System.out.println("no return no agrument ");

    }
    void show2 (int a ){
        System.out.println(""+a);
    }
    int show3 (){
        System.out.println("return no argument ");
        return 3;
    }
    int show4 (int b ){
        System.out.println(""+b);
        return b;
    }
    A2 show5 (){
        System.out.println("covariant ");
        return this;
    }
    
}
