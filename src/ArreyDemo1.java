import java.util.Arrays;
import java.util.Collections;

public class ArreyDemo1 {
    public static void main(String[] args) {
        int arr[] = new int[5];// Declaration and instantiation of array
        arr[0] = 10;// Initialisation of Array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
 /*     arr[5] = 60;  //giving error index bound of length because arra length is 5 so index is [0] to [4]
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
*/
        for (int i: arr){
            System.out.println(i);
        }


    }
}

//=============================================================================
class ArreyDemo2{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        for(int i:arr){
            System.out.println(i);
        }
    }
}

//
class OddEvenNumber{
    public static void main(String[] args) {
        int arr[] = {2,10,15,13,20,21};
        for(int i : arr){
            if (i%2 !=0){
    System.out.println(i);
            }
        }
    }
}
//
class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {2, 10, 15, 13, 20, 21};
        Arrays.sort(arr);

        for (int i : arr) {

            System.out.println(i);


        }
    }
}
//<==================== simple Arrays end of program ==============================>
class DescendingOrder{
    public static void main(String[] args) {
        int arr[] = {10,21,15,41,60};                  // for descending convert primitive to wrapper class
        Integer a[] = new Integer[]{10,21,15,41,60};
        Collections collections;                      // here first Collections is a class in Descanding order Collection is a class
        Arrays.sort(a,Collections.reverseOrder());
        for (int i:a){
            System.out.println(i);
        }
    }
}
//<=========================== Descanding order of arrays  end of program========================>

class MinMax{
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,0,2,1};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
}}