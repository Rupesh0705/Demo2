package Superkeyword;
// "Super" Key word is a reference variable which refers to parent class instance variable


public class Student {
    String  marks = "rupesh";
}

class Student1 extends Student {
    String marks = "50";

    public void marks() {
        System.out.println(super.marks);
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.marks();

    }
}
