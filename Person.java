public class Person {
    private String name;

    public Person(){
        name = "John Doe";
    }

    public Person(String n){
        name = n;
    }

    //getter methods
    public String getName(){
        return name;
    }

    //setter methods
    public void setName(String n){
        name = n;
    }

}
