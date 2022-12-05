package Menus;

import Refund.RefundHandler;
import UserAdmin.AuthenInfo;
import UserAdmin.Authentication;
import UserAdmin.User;

import java.util.Scanner;

public class AuthenticationMenu {
    public void display(Authentication auth, RefundHandler refundHandler) {
        System.out.println("\n ------- User Authentication Menu -----");
        System.out.println("1. LogIn");
        System.out.println("2. Signup");
        System.out.println("3. Return Home");
        System.out.println("------------------");
        int choice = Read.readChoice("||CHOICE||: ", 1, 3);

        switch (choice) {
            case 1 -> {
                System.out.print("Email:");
                String email = new Scanner(System.in).nextLine();

                System.out.print("Password:");
                String password = new Scanner(System.in).nextLine();

                AuthenInfo info = new AuthenInfo(email, password);
                User user = auth.loginUser(info);

                if (user != null) {
                    System.out.print("Successful Login ✅✅ \n");
                    new UserMenu().display(auth, user, refundHandler);
                } else {
                    System.out.print("Invalid Information ❌❌ \n");
                    new AuthenticationMenu().display(auth, refundHandler);
                }
            }
            case 2 -> {
                System.out.print("User Name:");
                String userName = new Scanner(System.in).nextLine();
                System.out.print("Email:");
                String email = new Scanner(System.in).nextLine();
                System.out.print("Password:");
                String password = new Scanner(System.in).nextLine();

                AuthenInfo info = new AuthenInfo(email, password);
                boolean is_successful = auth.signupUser(info, userName);

                if (is_successful) {
                    System.out.print("User Has Been Created ✅✅ \n");
                    new AuthenticationMenu().display(auth, refundHandler);

                } else {
                    System.out.print("User Already Exists ❌❌ \n");
                    new AuthenticationMenu().display(auth, refundHandler);
                }
            }
            case 3 -> {
                new HomeMenu().display(auth, refundHandler);
            }
            default -> System.out.println("Wrong Choice");
        }
    }
}