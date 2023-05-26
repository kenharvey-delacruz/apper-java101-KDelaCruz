package day5;

public class Croc extends Animal implements ForWaterOnly{
    @Override
    public void swim() {
        System.out.println("Croc is swimming");
    }
}