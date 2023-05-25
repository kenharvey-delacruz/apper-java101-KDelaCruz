package gcash.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckBalance {

    public static void CheckBalance(Map<String, User> userInfo) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("Magcheck ng balance");
        System.out.print("Ilagay ang numero na gustong i-check: ");
        String number = myScanner.next();


        if (userInfo.containsKey(number)) {

            for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
                if(number.equals(entry.getKey())){
                    System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
                    System.out.println("Ito ang impormasyon na iyong hinahanap: ");
                    System.out.println("Number: " + entry.getKey());
                    System.out.println("Name: " + entry.getValue().getName());
                    System.out.println("Balance: " + entry.getValue().getBalance());
                }
            }

        } else{
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
        }
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("Ito ang balance ng mga users");
        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
        }
    }
}
