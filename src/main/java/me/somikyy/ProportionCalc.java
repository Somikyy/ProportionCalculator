package me.somikyy;

import java.util.Scanner;

public class ProportionCalc {
    public static double getValidDouble(Scanner scanner, String message) {
        while(true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch(NumberFormatException e) {
                System.out.println("ERROR: Please enter a valid number");
            }
        }
    }

    public static int getValidInt(Scanner scanner, String message) {
        while(true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Please enter a valid number");
            }
        }
    }
}
