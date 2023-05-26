package day5;

public class TopicInterface {
    public static void main(String[] args) {
        Blueberry blueberry = new Blueberry();


        // if Blueberry is a cake, slice the Blueberry
        if(blueberry instanceof Cake){
            blueberry.slice();
        }
    }
}