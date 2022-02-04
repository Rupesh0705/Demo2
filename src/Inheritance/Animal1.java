
// Multi level Inheritance : child class(BabyDog1) extend to Parent class(Dog1) and Parent class(Dog1) extand to Grand parent class (Animal1)


package Inheritance;
//<======================= Multi level Inheritance==============>
public class Animal1 {
    public void eat(){
        System.out.println("eating");
    }
}
class Dog1 extends Animal1{
    public  void barking(){
        System.out.println("barking");
    }

}

class BabyDog1 extends Dog1{
    public void wheep(){
        System.out.println("wheeping");
    }

    public static void main(String[] args) {
        BabyDog1 obj = new BabyDog1();

        obj.wheep();
        obj.barking();
        obj.eat();
    }
}