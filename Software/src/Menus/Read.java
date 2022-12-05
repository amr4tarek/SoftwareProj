package Menus;

import java.util.Scanner;

public class Read {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readChoice(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double readMoney(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Money Range(" + min + " and " + max + ") cm");
        }
        return value;
    }
}
