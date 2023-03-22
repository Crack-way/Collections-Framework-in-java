package arraylist;


import java.util.Arrays;




public class Main {



    public static void main(String[] args){
        int n=3;

        Person p1=new Person(2,"Rupesh");
        Person p2=new Person(1,"Anuj");
        Person p3=new Person(3,"Anuj");

        Person[] arr =new Person[n];
        arr[0]=p3;
        arr[1]=p1;
        arr[2]=p2;

        Arrays.sort(arr);


        print(arr);




    }
    public static void print(Person[] arr)
    {
        for (Person person : arr) {
            System.out.println(person.getName());
            System.out.println(person.getId());
        }
    }
}
