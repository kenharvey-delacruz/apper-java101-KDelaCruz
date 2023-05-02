import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNumberVer2 {

    public static void main(String[] args) {
// This version is for looping for the test cases starting from 1 up to the maximum number available
// Change num and end in the for loop to test from 1 to 10M

        for ( int num = 1 ; num <= 23 ; num++) {
            long startTime = System.nanoTime();
            isPrimeNumber(num);
            long endTime = System.nanoTime();
            System.out.println("Duration for " + num + " is " + (endTime-startTime));
        }

// This version is for asking for user input including handling exceptions

//        int num;
//        Scanner myScanner = new Scanner(System.in);
//        try {
//            System.out.print("Enter a number: ");
//            num = myScanner.nextInt();
//            long startTime = System.nanoTime();
//            System.out.println(isPrimeNumber(num));
//            long endTime = System.nanoTime();
//            System.out.println("Duration for " + num + " is " + (endTime-startTime));
//
//        } catch (InputMismatchException e) {
//            System.out.println("Error: Input is not an integer.");
//        } catch (NoSuchElementException e) {
//            System.out.println("Error: Input is missing.");
//        } catch (IllegalStateException e) {
//            System.out.println("Error: Scanner is closed.");
//        } finally {
//            myScanner.close();
//        }

    }

    public static boolean isPrimeNumber(int num){

        int i = 2;
        if (num <= 1){
            return false;
        }

        while (i <= Math.sqrt(num)){
            if (num % i == 0){
                return false;
            }
            ++i;
        }

        return true;
    }
}