
// Switch : It is use to execute the one condition from the multiple of condition.
// switch (expression belongs to variable value)
// if we not use the break word than program will print all the statement after correct condition.

//<===================== Switch ==============================>



public class SwitchDemo {
    public static void main(String[] args) {
        int age = 21;
        switch(age){
            case 16:
                System.out.println("You are under 18");
               break;

            case 18:
                System.out.println("you are eligible for vote");
               break;
            case 20:
                System.out.println("You are above 18");
                break;
            case 25:
                System.out.println("You are above 18");

               break;
            default:
                    System.out.println("You are not eligible for vote");
        }
    }
}
