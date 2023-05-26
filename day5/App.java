package day5;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breath();

        Fish fish = new Fish();
        fish.breath();

        ForWaterOnly a = new Fish();
        ForWaterOnly b = new Croc();

        execForWaterOnly(a);
        execForWaterOnly(b);


    }

    static void execForWaterOnly(ForWaterOnly f){
        f.swim();
    }
}