package Payment;

public class Wallet {
    private double balance;

    public Wallet() {
        balance = 0;
    }

    public void add_value(double amount) {
        balance += amount;
    }

    public void reduce_value(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
