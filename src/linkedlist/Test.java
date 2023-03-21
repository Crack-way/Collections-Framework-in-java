package linkedlist;
import java.util.*;
public class Test {

    public static void main(String[] args){
        LinkedList<String> fruits=new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        Iterator<String> itr=fruits.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }







    }
}
