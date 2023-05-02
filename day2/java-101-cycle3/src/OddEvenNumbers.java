import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = myScanner.nextLine();
        System.out.println(isEven(Integer.parseInt(num)));
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
