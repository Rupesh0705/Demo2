package MethodWithArgument;

public class MethodWithArgs1 {
    public void demo1( int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodWithArgs1 obj = new MethodWithArgs1();
        obj.demo1(10,20);
        obj.demo1(20,30);
    }
}
