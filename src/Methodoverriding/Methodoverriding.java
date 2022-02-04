
// Method Overriding: If a child class have a method name same as declare in Parent class called Method overriding
// In method overriding Rules : (1) Method name must same as  in a parent class .....
//                              (2) Method parameters same as in a parent class.


package Methodoverriding;

    class Bike {
        public  void run(){
            System.out.println("Bike is running Safely");
        }
    }

    class Splender extends Bike{
        public void run(){
            System.out.println("Splender is running safely");
        }


        public static void main(String[] args) {
          Bike obj1 = new Splender(); //
    //        Bike obj2 = new Bike();
           obj1.run();
     //        obj2.run();
     //     Splender obj3 = new Splender();
     //      obj3.run();
        }

    }


