package zoo.managers;

import zoo.employees.Employees;
import zoo.visitors.Visitors;

public class Managers {
    public String name;
    public int age;
    public String title;

//    public Managers(String name, int age, String title) {
//        this.name = name;
//        this.age = age;
//        this.title = title;
//    }

// created methods and main to validate instantiation of variables

    void checkEmployee(){
        Employees employee = new Employees("Ken", 1000, "Lion");
        System.out.println("How much is salary of " + employee.name + ": " + employee.checkSalary());
        //Ask employee to feed animal
        System.out.println(employee.name + " is feeding the " + employee.feedAnimal().toLowerCase());
    }

    void checkVisitor(){
        Visitors visitor = new Visitors("Harvey", 19);
        // will not compile since age is set to private, can be accessed using getAge()
//        System.out.println(visitor.name + visitor.age);
        System.out.println("Get age of visitor " + visitor.name + ": " + visitor.getAge());

    }


    public static void main(String[] args) {
        Managers manager = new Managers();
        manager.checkEmployee();
        manager.checkVisitor();
    }
}
