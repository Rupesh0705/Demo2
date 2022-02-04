/* Abstract class: A class which declare by abstract keyword and can have abstract and non abstract method.
                   it needs to be extended.
   Abstract Method: A method is declared by "abstract" keyword and having no implementation called abstract method

Ways to abstraction: 1. By Abstract class (0 to 100 %) Because an abstract class having abstract and non abstract method
                     2. By Interface 100 % ===> Because Interface has only abstraction method.

Abstract Method : When the method is declared by the "abstract" key word  and method does have any implementation is
                 called Abstract Methos.
 what is abstrac class : The class declared by the "abstract" key word. t can have abstract and non abstract method.

*/

abstract class AbstractDEmo1 {//
    abstract void run();// un implemented method <=============== abstract method

    public void  average(){
        System.out.println(" good milage");
    } // <----- Non abstract method
}

class Honda extends AbstractDEmo1{
 public  void run(){
     System.out.println("running safely");

    }

    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.run();
        obj.average();
    }
}