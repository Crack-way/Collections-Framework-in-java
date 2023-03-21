package iterable;
import java.util.*;
import java.util.Iterator;

public class Test {



    public static void main(String[] args){

        //Creating type safe arraylist for Integer and adding value.
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(15);
        numbers.add(67);
        numbers.add(55);
        numbers.add(78);

        //using iterator in arraylist.
        Iterator<Integer> iterator=numbers.iterator();

        //Run till the array has next value
        while(iterator.hasNext()){

            //pointing the current object in arraylist.
            Integer number=iterator.next();
            System.out.println(number);
        }



        while(iterator.hasNext()){

            //pointing the current object in arraylist.
            iterator.next();
            //removing the elements from the arraylist.
            iterator.remove();
        }







    }
}
