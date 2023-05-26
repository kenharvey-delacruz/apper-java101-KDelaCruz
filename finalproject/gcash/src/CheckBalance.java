package gcash.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckBalance {

    public static void CheckBalance(Map<String, User> userInfo) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Magcheck ng balance");
        System.out.print("Ilagay ang numero na gustong i-check: ");
        String number = myScanner.next();

        while(true) {
            if (!userInfo.containsKey(number)) {
                System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
                System.out.print("Ilagay ang numero na gustong i-check: ");
                number = myScanner.next();
            } else {
                System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                System.out.println("Ito ang impormasyon na iyong hinahanap: ");
                System.out.println("Number: " + number);
                System.out.println("Name: " + userInfo.get(number).getName());
                System.out.println("Balance: " + userInfo.get(number).getBalance());
                break;
            }
        }

//        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
//        System.out.println("Ito ang balance ng mga users");
//        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
//        }
    }
}
