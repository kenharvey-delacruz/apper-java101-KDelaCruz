package gcash.src;

import java.util.Map;
import java.util.HashMap;

public class User {
    private String name;
    private double balance;


    public User(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }
}
