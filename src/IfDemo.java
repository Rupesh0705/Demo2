public class IfDemo {

    static int mark = 33;

    public static void main(String[] args) {

        if(mark<=35){
            System.out.println("fail");
        }


    }


}
//
class IfElseDemo1{

    static int marks = 60;

    public static void main(String[] args) {

        if (marks==35){                                 // here we used Relational operator "=="
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
    }

}
//
class IfElseDemo2{

    public static void main(String[] args) {

        float sugarlevel = 6.5f;

        if (sugarlevel >= 6.5 || sugarlevel >= 10) { // here we used Relational operator">=,<=" and logical operator"||(OR)"
            System.out.println("Type Diabetes-1");
        } else {
            System.out.println("No Diabetes");
        }

    }}
//


// <========================== if else if =======================================>

// if else if execute  one statement from multiple condition


class IfElseIfDemo1{
    public static void main(String[] args) {
        double time = 06.30;
        if (time>=6.0 && time<=12.0){
            System.out.println("It's Morning");}
            else if (time>=12.0 && time<=17.0){
                System.out.println("it's Afternoon");}
        else if(time>=17.0 && time<=20.0){
            System.out.println("It's Evening");}
        else{
            System.out.println("It's night");
        }
            }
        } // end of program

