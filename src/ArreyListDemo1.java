import java.util.ArrayList;
import java.util.Collections;
public class ArreyListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars.get(0));

        for (String car : cars) {
            System.out.println(car);
        }


    }
}
//<======================= end of program ArraysList ================>
// <==== Below program is for Ascending and Descanding of Arraylist
class ArrayListDemo2{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");

       Collections.sort(cars);// this command for Ascanding of ArrayList
 //       Collections.sort(cars,Collections.reverseOrder()); // This command for Descanding Array list


        for (String car:cars){
            System.out.println(car);
        }



    }}



