
// Inheritance : " It is mecahnisam in which one class acquire all the properties and behaviour of a parent class"


package Inheritance;
//<================ Single Inheritance=============>
public class Animal {
    public void eat(){
        System.out.println("eating");
    }
}


class Dog extends Animal{
    public void bark(){
        System.out.println("barking");
    }

    public static void main(String[] args) {
        Dog obj= new Dog();
        obj.bark();
        obj.eat();
    }

}