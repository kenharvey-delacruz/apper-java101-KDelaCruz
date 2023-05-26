package day5;

public class Fish extends Animal implements NoLeg, ForWaterOnly {
    @Override
    public void swim() {
        System.out.println("Fish swimming");
    }

    @Override
    public void dontWalk() {

    }

    @Override
    public void breath(){
        System.out.println("Fish Breathing....");
    }
}
