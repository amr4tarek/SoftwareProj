package Refund;

import java.util.Objects;
import java.util.Vector;

public class RefundHandler {
    private Vector<Transaction> transactions = new Vector<Transaction>();
    private Vector<Transaction> refunds = new Vector<Transaction>();


    public Vector<Transaction> getTransactions() {
        return transactions;
    }

    public boolean addTransaction(Transaction transaction) {
        for (Transaction value : transactions) {
            if (Objects.equals(value.id, transaction.id)) return false;
        }
        transactions.add(transaction);
        return true;
    }


    public boolean removeTransaction(Transaction transaction) {
        for (int i = 0; i < transactions.size(); i++) {
            if (Objects.equals(transactions.get(i).id, transaction.id)) {
                transactions.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean addRefundReq(Transaction transaction) {
        for (Transaction value : transactions) {
            if (Objects.equals(value.id, transaction.id)) return false;
        }
        transactions.add(transaction);
        return true;
    }


    public boolean removeRefund(String id) {
        for (int i = 0; i < transactions.size(); i++) {
            if (Objects.equals(transactions.get(i).id, id)) {
                transactions.remove(i);
                return true;
            }
        }
        return false;
    }

    public Vector<Transaction> getRefunds() {
        return refunds;
    }

    public Transaction getTransaction(String id) {
        for (Transaction value : transactions) {
            if (Objects.equals(value.id, id)) return value;
        }
        return null;
    }

    public void showRefundRequests() {
        for (Transaction value : transactions) {
            System.out.println(value.id + " " + value.user.name + " " + value.money);
        }
    }
}
