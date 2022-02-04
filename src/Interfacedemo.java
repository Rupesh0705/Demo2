/* Interface : Interface is a blue print of a class. it can not have a static,non static or final method.
               It must not have non abstract method. No implementation.
Advantage of Interface: Achieve 100 % abstraction
                        Multiple heritance is possible by interface

 ##   <===   DIFFERENCE BETWEEN  Abstract Class and Interface ==>

                      Abstract Class                                          Interface
1. Abstract class must have a abstract and non abstract method   || 1. Interface have only abstract method
2. With Abstract Class you can achieve between 0-100% abstraction|| 2.With Interface 100 % abstraction possible
3. Multiple Inheritance is not possible                          || 3. Multiple inheritance is possible
 */
//======================================================================================================================
public interface Interfacedemo {
    public  interface  Bike{
        abstract  void run();
    }
 class  splender  implements Bike{
        public  void  run(){
            System.out.println("Running safely");
        }

     public static void main(String[] args) {
         splender obj = new splender();
         obj.run();
     }
 }


}
// <================================== end of program ==============================>


// <== Below is the example of Multiple inheritance is possible by Interface ( remember class implements interface)===>
interface Grandparent{
    public abstract void  property();
}
interface  parent {
    public abstract void balance();
}
interface children extends Grandparent,parent{
    public abstract void account();
}
class Grandchildren implements children{
    public void property(){
        System.out.println("This is a grand parent property");
    }
    public void balance(){
        System.out.println("This is a parents property");
    }
    public void account(){System.out.println("This is a children property");}

    public static void main(String[] args) {
        Grandchildren obj = new Grandchildren();
        obj.property();
        obj.balance();
        obj.account();
    }


}// <========== end of programm ===============>
