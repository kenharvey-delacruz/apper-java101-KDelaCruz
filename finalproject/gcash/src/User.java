package gcash.src;

public class User implements Share, Load{
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

    @Override
    public boolean receiveLoad(User recipient, double amount) {
        return false;
    }

    @Override
    public boolean sendLoad(User recipient, double amount) {
        return false;
    }
}
