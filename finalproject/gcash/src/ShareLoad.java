package gcash.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ShareLoad {

    public static void ShareLoad(Map<String, User> userInfo){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Magshare ng load");

        System.out.print("Ilagay ang numero na magsesend ng load: ");
        String sender = myScanner.next();

        while(true) {
            if (!userInfo.containsKey(sender)) {
                System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
                System.out.print("Ilagay ang numero na magsesend ng load: ");
                sender = myScanner.next();
            } else {
                break;
            }
        }

        System.out.print("Ilagay ang numero na sesendan ng load: ");
        String receiver = myScanner.next();

        while(true) {
            if (!userInfo.containsKey(receiver)) {
                System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
                System.out.print("Ilagay ang numero na sesendan ng load: ");
                receiver = myScanner.next();
            } else if (receiver.equals(sender)){
                System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                System.out.println("Hindi puwedeng magkamukha ang magsesend at sesendan!");
                System.out.print("Ilagay ang numero na sesendan ng load: ");
                receiver = myScanner.next();
            } else {
                break;
            }
        }

        System.out.print("Ilagay kung magkano ang isesend: ");
        double transfer = Double.parseDouble(myScanner.next());

        while(true) {
            if (transfer <= 0) {
                System.out.println("Walang halaga, hindi puwede yarn!");
                System.out.print("Ilagay kung magkano ang isesend: ");
                transfer = Double.parseDouble(myScanner.next());
            } else if (userInfo.get(sender).getBalance() < transfer) {
                System.out.println("Kulang ang balance ng iyong sender!");
                System.out.print("Ilagay kung magkano ang isesend: ");
                transfer = Double.parseDouble(myScanner.next());
            }
            else {
                break;
            }
        }

        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Tagumpay! Ang numerong " + sender + " (" + userInfo.get(sender).getName() + ") " + "ay nagshare kay " + receiver + " (" + userInfo.get(receiver).getName() + ") " +  "ng " + transfer + " load!");

        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Ito ang bagong impormasyon ng nagsend: ");
        userInfo.put(sender, new User(userInfo.get(sender).getName(), userInfo.get(sender).getBalance()-transfer));
        System.out.println("Number: " + sender);
        System.out.println("Name: " + userInfo.get(sender).getName());
        System.out.println("Balance: " + userInfo.get(sender).getBalance());

        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Ito ang bagong impormasyon ng sinendan: ");
        userInfo.put(receiver, new User(userInfo.get(receiver).getName(), userInfo.get(receiver).getBalance()+transfer));
        System.out.println("Number: " + receiver);
        System.out.println("Name: " + userInfo.get(receiver).getName());
        System.out.println("Balance: " + userInfo.get(receiver).getBalance());

        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
        System.out.println("Ito ang balance ng mga users");
        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
        }

    }
}
