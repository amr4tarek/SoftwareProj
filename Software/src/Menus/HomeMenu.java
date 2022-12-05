package Menus;

import Refund.RefundHandler;
import UserAdmin.Admin;
import UserAdmin.AuthenInfo;
import UserAdmin.Authentication;

import java.util.Scanner;

public class HomeMenu {
    public void display(Authentication auth, RefundHandler refundHandler) {
        System.out.println("\n ------- Home Menu -----");
        System.out.println("1. User Account");
        System.out.println("2. Admin Account");
        System.out.println("------------------");
        int choice = Read.readChoice("||CHOICE||: ", 1, 2);

        switch (choice) {
            case 1 -> {
                new AuthenticationMenu().display(auth, refundHandler);
            }
            case 2 -> {
                System.out.print("EMAIL [ans: software.com]:");
                String email = new Scanner(System.in).nextLine();

                System.out.print("PASSWORD [ans: 1234]:");
                String password = new Scanner(System.in).nextLine();

                // use check in from authentication
                AuthenInfo info = new AuthenInfo(email, password);

                Admin admin = auth.loginAdmin(info);
                if (admin != null)
                    new AdminMenu().display(auth, refundHandler);
                else {
                    System.out.print("[WRONG INFORMATION ❌❌] \n");
                    new HomeMenu().display(auth, refundHandler);
                }
            }
            default -> System.out.println("Wrong Choice");
        }
    }
}