import java.util.ArrayList;

public class TryCatchDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.get(0));


        try{
            System.out.println(numbers.get(3));
        }
        catch(Exception e){
            System.out.println("something went wrong");}
           finally{
               System.out.println("try catch block handle exception");
            }



        System.out.println(numbers.get(1));
    }

}
// <=== Exception Handling  try catch and finally  key word demo  =====>

class StringDemo1{
    public static void main(String[] args) {
        char ch[] = {'r','u','p','e','s','h'};
        String s = new String (ch);
        System.out.println(s);
}}
