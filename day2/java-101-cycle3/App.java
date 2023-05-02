 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        int age = 15;

        System.out.println(age);
        age = age+10;
        System.out.println(age);

        double newPrice = 5.5 + age;
        System.out.println(newPrice);

        double num1 = 1;
        float num2 = 4000.54f;

        double v = num1 + num2;

        allAboutStrings();

        int test;
        do {
            System.out.print("Enter a positive integer (0 to quit): ");
            test = scanner.nextInt();
            if (test > 0) {
                System.out.println("The square of " + test + " is " + (test * test));
            }
        } while (test != 0);
    }

    public static void allAboutStrings(){
        int number1 = 1;
        char number1char = '1';
        String number1string = "1";

        String myName = "Orvyl";
        System.out.println(myName);
        System.out.println(myName.toLowerCase());

        int num = 1;
        while (num <= 10){
            System.out.println(num);
            ++num;
        }


    }
}