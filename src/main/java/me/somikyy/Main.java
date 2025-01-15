package me.somikyy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            double grams = ProportionCalc.getValidDouble(scanner, "Enter the grams for your recipe:");
        
            int portions = ProportionCalc.getValidInt(scanner, "Enter the number of portions:");
            if (portions > 0) {
                double gramsPerPortion = grams / portions;
                System.out.println("Each portion will weigh: " + gramsPerPortion + " grams.");
            } else {
                System.out.println("The number of portions must be > 0.");
            }
        
            System.out.println("Do you want to repeat the program? (Yes/No)");
            answer = scanner.next().trim();
        
        } while (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("yes"));
        
        scanner.close();
    }
}
