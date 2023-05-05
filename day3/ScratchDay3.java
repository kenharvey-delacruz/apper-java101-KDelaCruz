public class ScratchDay3 {

    static int age;
    static double salary;
    static boolean isHappy;
    static char favoriteLetter;
    static float weight;
    static long distance;

    static Integer wrapperAge;
    static Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        //wrapper

        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);

        //System.out.println(wrapperAge + 10);

        int a = 9;
        int b = 10;
        int c = 78;
        System.out.println(c%4);
        System.out.println((a+b)*c%4);

        Animals();

        Animal animal = Animal.DOG;

        switch (animal){
            case DOG: System.out.println("arf arf"); break;
            case CAT: System.out.println("meow meow"); break;
            case GOAT: System.out.println("meeeh"); break;
            case COW: System.out.println("roar roar"); break;
            default:
                System.out.println("Yehey");
        }
    }

    public static void Animals(){

        String animal = "cat";

        if (animal.equals("dog")){
            System.out.println("Arf arf");
        } else if (animal.equals("cat")){
            System.out.println("Meow meow");
        } else if (animal.equals("goat")){
            System.out.println("meeeh");
        } else {
            System.out.println("yehey");
        }

        animal = "lion";

        switch (animal){
            case "dog": System.out.println("arf arf"); break;
            case "cat": System.out.println("meow meow"); break;
            case "goat": System.out.println("meeeh"); break;
            case "lion": System.out.println("roar roar"); break;
            default:
                System.out.println("Yehey");
        }

    }

    public enum Animal {
        DOG, CAT, GOAT, COW
    }
}
