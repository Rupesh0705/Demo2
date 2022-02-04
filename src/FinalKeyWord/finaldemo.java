
// "final" key word is use to restric the user
// "final can be variable,method or a class.
// final variable - can not change the value of variable.
// final method   - can not overriding method
// final class    - can not extend the class
//-----------------------------------------------------------------------------------------------------

package FinalKeyWord;
    public class finaldemo {
        final int marks = 50;

        public void execute() {
//             marks = 20;                    //(can not change the value of a variable because it's already final.t
            System.out.println(marks);
        }

        public static void main(String[] args) {
            finaldemo obj = new finaldemo();
            obj.execute();
        }
    }
// end of programm    <======= Final key word for  variable =========>
//
    class demo1{

        final public void execute() {
            int number = 30;
            System.out.println(number);}
        static class demo2 extends demo1{
            int number = 50;
          //  public void execute()        //(can not keep the same method name)
            public void execute1()
            {

                System.out.println(number);
            }

            public static void main(String[] args) {
                demo2 obj = new demo2();
               // obj.execute1();
                obj.execute();
            }

        }
    } // end of program <======= final key word for Method ================>



//  final class demo3{
// public void execute(){
//        System.out.println("This is number");
//                }
//           }
//class demo4 extends demo3{}                 // can not extends by final class

//   <======= final key word for class ================>

    class Overloading{
        final public void run(int a,int b){
            System.out.println(a+b);
        }

        public void run(int a,int b,int c){
            System.out.println(a+b+c);
        }

        public void run(int a,int b,int c,int d){
            System.out.println(a+b+c+d);
        }

        public static void main(String[] args) {
            Overloading obj = new Overloading();
            obj.run(10,20);
            obj.run(10,20,30);
            obj.run(10,20,30,40);
        }
    }
// end of programme <== final key word for method overloading  result = possible



