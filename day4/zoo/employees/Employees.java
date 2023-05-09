package zoo.employees;

public class Employees {

    public String name;
    private double salary;
    public String assignedAnimal;

    public Employees(String name, double salary, String assignedAnimal) {
        this.name = name;
        this.salary = salary;
        this.assignedAnimal = assignedAnimal;
    }

    public String feedAnimal(){
        return assignedAnimal;
    }

    public double checkSalary(){
        return salary;
    }
}
