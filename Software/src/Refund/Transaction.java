package Refund;

import UserAdmin.User;

public class Transaction {
    public String id;
    public User user;
    public double money;

    public Transaction(String id, User user, double money) {
        this.id = id;
        this.user = user;
        this.money = money;
    }
}
