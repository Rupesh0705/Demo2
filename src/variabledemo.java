//<===================== local variabled ================================>
// Local Variable is declare in side the body of the method.

public class variabledemo {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a * b;

        System.out.println(c);
        System.out.println(d);
    }
}// local variable end here


// <==================================== Instance Variable ==========================>
// Instance variable  declare inside the class but out side the body of the method

 class InstanceVariableDemo{

     int e = 10;
     int f = 20;
     int g = e + f;

     public static void main(String[] args) {
         InstanceVariableDemo obj = new InstanceVariableDemo();
         obj.Demo();
     }
    public void Demo(){
         System.out.println(g);
    }

}//Instance Variable end here



// <============================= Static Variable ==================================>
// Statice variable declared inside the class but out side the body of the method.
// Static variable is declare with usinf static key word.
// static key word is use for memory management

class StaticVariableDemo{

    static int h = 10;
    static int i = 20;
    static int j = i + h;

    public static void main(String[] args){
     System.out.println(h);
     System.out.println(j);
    }
}// static variable end here




//<======================== Non Static user define method ===========================>
// In  non static method we need the object to call the nonstatic method in to the main method
// syntax for nonstatic method is "classname obj = new classname ();"

class NonstaticDemo{//non static udm;

        int a = 10;
        int b = 20;
        int c = a + b;

    public  static void main(String[] args){

        NonstaticDemo obj = new NonstaticDemo();

        obj.demo();
    }

     public void demo() {

         System.out.println(c-a+b);

     }

}//non static udm is end here



// <============================ static user define method=============================>
// for static method we do not need the object to call the method in to the main method

class StaticudmDemo{

        static int g = 10;
        static int h = 20;
        static int i = g + h;

        public static void main(String[] agrs){
               System.out.println(i);

        }
    }// staticudm demo end here.


//<==================== String demo ===========>
// String is an object to represent a sequence of a character
// Concatination : To join two or more string to gather is clled concatination

class StringDemo{

    public static void main(String[] args) {
        String firstname = "Rupesh";
        String lastname ="Shah";

    System.out.println(firstname +" "+ lastname);
    System.out.println("Rupesh"+" "+"Shah");

    int a = 10;
    int b = 20;
    int c = a + b;

    System.out.println("total 0f a & b="+c);


    }
}