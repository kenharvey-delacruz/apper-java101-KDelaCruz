package gcash.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ShareLoad {

    public static void ShareLoad(Map<String, User> userInfo){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("Magshare ng load");

        System.out.print("Ilagay ang numero na magsesend ng load: ");
        String sender = myScanner.next();

        if (!userInfo.containsKey(sender)){
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
            return;
        }

        System.out.print("Ilagay ang numero na sesendan ng load: ");
        String receiver = myScanner.next();

        if (receiver.equals(sender)) {
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("Hindi puwede yarn!");
            return;
        }

        if (!userInfo.containsKey(receiver)){
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
            System.out.println("Ang numerong ito ay hindi pa naka rehistro!");
            return;
        }

        System.out.print("Ilagay kung magkano ang isesend: ");
        double transfer = Double.parseDouble(myScanner.next());

        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("Tagumpay! Ang numerong " + sender + " ay nagshare kay " + receiver + " ng " + transfer + " load!");

        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
            if(sender.equals(entry.getKey())){
                System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
                System.out.println("Ito ang bagong impormasyon ng nagsend: ");
                userInfo.put(sender, new User(entry.getValue().getName(), entry.getValue().getBalance()+transfer));
                System.out.println("Number: " + entry.getKey());
                System.out.println("Name: " + entry.getValue().getName());
                System.out.println("Balance: " + entry.getValue().getBalance());
            }

            if(receiver.equals(entry.getKey())){
                System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
                System.out.println("Ito ang bagong impormasyon ng sinendan: ");
                userInfo.put(receiver, new User(entry.getValue().getName(), entry.getValue().getBalance()-transfer));
                System.out.println("Number: " + entry.getKey());
                System.out.println("Name: " + entry.getValue().getName());
                System.out.println("Balance: " + entry.getValue().getBalance());
            }

        }
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("Ito ang balance ng mga users");
        for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
        }

    }
}
