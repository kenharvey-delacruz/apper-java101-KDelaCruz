package zoo.visitors;

public class Visitors {

    public String name;
    private int age;

    public Visitors(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
