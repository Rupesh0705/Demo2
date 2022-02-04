
// in Hierarchical inheritance two or more class extends by single class

// Miltiple Inheritance is not possible in class because one class extends by two or more class,.....
//  may be due to the same method


// <========================= Hierarchical Inheritance ================================>
package Inheritance;

public class Mainbank {
    public void mainbranch(){
        System.out.println("This is a main Bank");
    }
}
class Hsbc extends Mainbank{
    public void branch(){
        System.out.println("this is a hsbc bank");
    }
}

class Lioyds extends Mainbank{
    public void subbranch(){
        System.out.println("This is lioyds bank");
    }

    public static void main(String[] args) {
        Lioyds obj = new Lioyds();
        obj.mainbranch();
        obj.subbranch();

    }
}