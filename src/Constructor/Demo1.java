/* Constructor is a block of a codes ,similar as method. It is called when the object is created which is use
   to initialised the object
  There are Two type of |Constructor
1.Default Constructor:      No variable declare in the bracket next to the constructor name(demo1) called
                            "Default Constructor"
2.Parameterised Constructor:variable declare in the bracket next to the constructor name(demo2) called
                            "Parameterised Constructor"
"this" key word:  Is reference variable which refers the current class object
                  it can be used to refer the current class instance variable


*/

package Constructor;



public class Demo1 {
    public Demo1(){
        System.out.println("It is a constructor demo");
    }// no return data type void

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
    }
}// Default constructor end



class Demo2 {
    public Demo2(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2(100, 20);
        Demo2 obj1 = new Demo2(20, 5);
        Demo2 obj2 = new Demo2(10, 10);
    }
}// Parameterised constructor end




//====================    "this" key word =======================================================>

// " this " key word is reference variable which refers the current class object
// it  can be used to refer the current class instance variable

class Demo3{
    int a;
    int b;
    public Demo3(int c,int d){
        this.a=c;
        this.b=d;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
    Demo3 obj= new Demo3(30,40);
    }
}
