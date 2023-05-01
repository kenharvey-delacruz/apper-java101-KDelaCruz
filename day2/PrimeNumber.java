import java.util.Scanner;

class PrimeNumber{

    public static Boolean isPrime(int number){

        int i = 2;

        if (number <= 1){
            return false;
        }

        while (i <= number/2) {
            System.out.println(i + " " + number/2);
            if (number % i == 0){
                System.out.println(i + " false " + number/2);
                return false;
            }
            ++i;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to PrimeNumber.java!");
        System.out.print("Enter a number: ");
        Scanner myScanner = new Scanner(System.in);
        int number = Integer.parseInt(myScanner.nextLine());

        Boolean PrimeOrNot = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + PrimeOrNot + "!");
    }
}