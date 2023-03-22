package Queue;

import java.util.*;
public class Test {




    public static void main(String[] args){
        //Queue can be instanitated in two ways.
//        Queue<String> q1 = new PriorityQueue();
//        Queue<String> q2 = new ArrayDeque();


        //PriorityQueue

        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4, 6, 7, 6, 5, 4, 3};

        // Create a HashMap to store the frequency of each integer
        // TODO: Write code here

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        // Loop through the array and update the frequency in the HashMap
        // TODO: Write code here


        for(int arr1:arr){

            map.put(arr1,arr1+1);
        }





        // Print the frequency of each integer
        // TODO: Write code here
        //Map cannot be traversed so we need to convert it into set.
        Set set=map.entrySet();

        Iterator itr=set.iterator();

        while(itr.hasNext()){

            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }




    }
}
