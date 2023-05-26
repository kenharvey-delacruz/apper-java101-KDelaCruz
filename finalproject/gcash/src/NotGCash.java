package gcash.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotGCash {

    private static Map<String, User> userInfo = new HashMap<>();

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        userInfo.put("09175861661", new User("Ken", 100.00));
        userInfo.put("09175861662", new User("Kristofer",120.00));
        userInfo.put("09175861663", new User("Keith",150.00));
        userInfo.put("09175861664", new User("Karl", 200.00));
        userInfo.put("09175861665", new User("King", 300.00));

        while(true){

            System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
            System.out.println("Maligayang Pagdating sa HindiGCash!");
            System.out.println("Pumili sa mga sumusunod:\n");
            System.out.println("1. Magrehistro ng bagong user");
            System.out.println("2. Magshare ng load");
            System.out.println("3. Magcheck ng balance");
            System.out.println("4. Umalis");
            System.out.print("\nI-type lamang ang numerong napili: ");
            int napili = Integer.parseInt(myScanner.next());

            switch(napili){
                case 1:
                    RegisterUser.Register(userInfo);

                    break;

                case 2:
                    ShareLoad.ShareLoad(userInfo);
                    break;

                case 3:
                    CheckBalance.CheckBalance(userInfo);
                    break;

                case 4:

                    System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                    System.out.println("Ito ang balance ng iyong mga users:");
                    for (HashMap.Entry<String, User> entry : userInfo.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " - " + entry.getValue().getBalance());
                    }
                    System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                    System.out.println("Paalam mula sa NotGCash!");
                    System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");
                    System.exit(0);

                default:
                    System.out.println("Mali ang iyong nilagay na numero. 1-4 lang po.");
            }

        }
    }



}
