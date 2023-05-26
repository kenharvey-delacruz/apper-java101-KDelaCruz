package gcash.src;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class RegisterUser {
    public static void Register(Map<String, User> userInfo) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Magrehistro ng bagong user");

        System.out.print("Ilagay ang numero ng bagong user: ");
        String number = myScanner.next();

        while (true) {
            if (number.isBlank() || number.isEmpty() || ( number.length() != 11) ) {
                System.out.println("Paki-ayos ang paglagay ng numero");
                System.out.print("Ilagay ang numero ng bagong user: ");
                number = myScanner.next();
            } else {
                break;
            }
        }

        if (userInfo.containsKey(number)) {
            System.out.println("Ang numerong ito ay naka rehistro na!");
            System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        } else {

            System.out.print("Ilagay ang pangalan ng bagong user: ");
            String name = myScanner.next();

            while (true) {
                if (name.isBlank() || name.isEmpty() || name.matches("^[0-9]+$")) {
                    System.out.println("Paki-ayos ang paglagay ng pangalan");
                    System.out.print("Ilagay ang pangalan ng bagong user: ");
                    name = myScanner.next();
                } else {
                    break;
                }
            }

            userInfo.put(number, new User(name, 100));
            System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
            System.out.println("Ang numerong " + number + " ay matagumpay na na-irehistro!");

            for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
                if (number.equals(entry.getKey())) {
                    System.out.println("Ito ang impormasyon ng bagong user: ");
                    System.out.println("Number: " + entry.getKey());
                    System.out.println("Name: " + entry.getValue().getName());
                    System.out.println("Balance: " + entry.getValue().getBalance());
                }
            }

        }
        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Ito ang balance ng mga users");
        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
        }
    }
}
