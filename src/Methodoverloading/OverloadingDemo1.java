package Methodoverloading;

// Method overloading: If a class having a multiple method having a same name but different in parameters called .......
//                     Method overloading



public class OverloadingDemo1 {
        public void demo1(int a ,int b){
            System.out.println(a+b);

        }
        public void demo1(int a,int b, int c){
            System.out.println(a+b+c);
        }

        public static void main(String[] args) {
            OverloadingDemo1 obj = new OverloadingDemo1();
            obj.demo1(10,20);
            obj.demo1(10,20,30);

        }


}
//    end od programme

    class  overloading2{
        public void method1(int a,int b){
            System.out.println(a*b);
        }
        public void method1(int a , int b, int c){
            System.out.println(a*b*c);
        }

        public static void main(String[] args) {
            overloading2 obj = new overloading2();
            obj.method1(10,20);
            obj.method1(1,2,3);
        }
    }
