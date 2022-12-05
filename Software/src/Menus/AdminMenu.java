package Menus;

import Refund.RefundHandler;
import Refund.Transaction;
import UserAdmin.Authentication;

import java.util.Scanner;

public class AdminMenu {
    public void display(Authentication authentication, RefundHandler refundHandler) {
        System.out.println("\n ------- Admin Menu -----");
        System.out.println("1. Add Discount");
        System.out.println("2. Show Refunds Request [Accept/Reject]");
        System.out.println("3. Logout");

        System.out.println("------------------");
        int choice = Read.readChoice("||CHOICE||: ", 1, 3);

        switch (choice) {
            case 1 -> {
                System.out.print("Service Name For Discount:");
                String service = new Scanner(System.in).nextLine();
                System.out.println("Discount added successfully!✅✅");
            }
            case 2 -> {
                refundHandler.showRefundRequests();

                System.out.println("1. Accept Refund By ID");
                System.out.println("2. Reject Refund By ID");
                int choice2 = Read.readChoice("||CHOICE||: ", 1, 2);

                String id = String.valueOf(Read.readChoice("ID: ", 1, 100000000));
                switch (choice2) {
                    case 1 ->{
                        Transaction transaction = refundHandler.getTransaction(id);
                        transaction.user.wallet.add_value(transaction.money);
                        refundHandler.removeRefund(id);
                        System.out.print("Refund" + id + "Has Been Accepted ✅✅ \n");
                    }
                    case 2 ->{
                        refundHandler.removeRefund(id);
                        System.out.print("Refund" + id + "Has Been Rejected ❌ \n");
                    }
                }
                break;
            }
            case 3 -> {
                new HomeMenu().display(authentication, refundHandler);
            }
            default -> System.out.println("Wrong Choice");
        }
        if (choice < 3) new AdminMenu().display(authentication, refundHandler);
    }
}