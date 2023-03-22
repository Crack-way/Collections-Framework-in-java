package arraylist;

public class Person  implements Comparable<Person>{
    int id;
    String name;


    Person(int id,String name){

        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person a) {


        if (this.name.compareTo(a.name) != 0) {

            return this.name.compareTo(a.name);
        }
        else {


            return Integer.compare(this.id, a.id);



    }
}
}
