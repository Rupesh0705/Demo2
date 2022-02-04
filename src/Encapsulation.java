/*Encapsulation: By using private data member you can wrapping data into a class and we using setter and getter......
method to get the data in it.
Advantage of Encapsulation in Java:
1.It provide the control over the data
2.It is the way to achieve data hiding
3.It is easy to test.
*/




public class Encapsulation {
    private String name; // right click and select generate and choose "getter and setter"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("rupesh");
        System.out.println(obj.getName());
    }
}
// end of program

class Encapsulation1{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Encapsulation1 obj = new Encapsulation1();
        obj.setA(50);
        System.out.println((obj.getA()));
    }
}
// end of programm

class EncapsulationDemo2{
    private int accountno;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public static void main(String[] args) {
        EncapsulationDemo2 obj = new EncapsulationDemo2();
        obj.setAccountno(123456);
        System.out.println((obj.getAccountno()));
        obj.setBalance(25000);
        System.out.println((obj.getBalance()));
    }
}