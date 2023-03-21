package map;
import java.util.*;

public class Test {


    public static void main(String[] args){

        //Hashmap example
        //Constant time performance and not thread safe and it doesnot maintain the order like when it is added.
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("apple", 3);
        myMap.put("banana", 2);
        myMap.put("orange", 4);

        System.out.println(myMap.get("apple")); // prints 3
        System.out.println(myMap.containsKey("banana")); // prints true
        System.out.println(myMap.containsValue(5)); // prints false


        //TreeMap example
        //Treemap maintain key in sorted order which is slower than hashmap

        TreeMap<String, Integer> map = new TreeMap<>();

        // Add some key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Print the map
        System.out.println("TreeMap: " + map);

        // Get the value associated with a key
        System.out.println("Value associated with Alice: " + map.get("Alice"));

        // Remove a key-value pair
        map.remove("Charlie");

        // Print the updated map
        System.out.println("Updated TreeMap: " + map);

        //LinkedHashMap example
        //
    }
}
