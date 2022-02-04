/* Loop : Loop is use to execute the set of a statement repetatily untill the perticular condition is true
 There are four types of Loops
 1. Simple For loop:     "for loop is use to iterate the part of a program several times
 2. For each Loop  :
 3. while Loop     : It is use to execute the target statement as long as the condition is true
 4. Do while Loop  : Do while loop is use to execute the block of statement continiously until the given condition
                     is satisfy.Dowhile is same as while loop except condition is checked after the statement is execute.
                     so in do while loop it gurentees the loop execute at leat once.
========================================================================================================================
*/

public class ForloopDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
// for loop end program

//<============================    while loop =========================================>

// While loop : It is use to execute the target statement as long as the condition is true.

class WhileloopDemo{
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}
// while loop end program


//<================================== Do while loop ================================>
// Do while loop : is use to execute the block of statement continiously until the given statement is true
// Dowhile is same as while loop except condition is checked after the statement is execute. ...........
// so in do while loop it gurentees the loop execute at leat once.

class DoWhileDemo{
    public static void main(String[] args) {
        int i= 1 ;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=6
        );
    }

}// do while loop end of program

//<========================= Break with for loop ======================>

class BreakWithForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);

        }
    }
}