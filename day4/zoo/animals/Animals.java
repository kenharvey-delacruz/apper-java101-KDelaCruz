package zoo.animals;

public class Animals {
    public String name;
    public String type;
    public String food;

    public Animals(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public void makeSound(){
        System.out.println("Make sound");
    }

    public void chewFood(){
        System.out.println("Chew food");
    }

    public static void main(String[] args) {
        Animals animals = new Animals("Lion", "Fighting", "Meat");
        animals.makeSound();
        animals.chewFood();

    }
}
