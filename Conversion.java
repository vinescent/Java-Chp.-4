// Shaurya Jain
// Conversion.java
// This program converts between fahrenheit and celsius, and feet and miles.

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int choice = menu();

        if (choice == 1) {
            FtoC();
        } else if (choice == 2) {
            FtoM();
        } else {
            System.out.println("Exiting program.");
        }
    }

    public static int menu() {
        Scanner kb = new Scanner(System.in);
        int choice = -1;

        while (choice != 0 && choice != 1 && choice != 2) {
            System.out.print("Enter 1 to convert between fahrenheit and celsius, 2 to convert between feet and miles, 0 to exit: ");
            choice = kb.nextInt();
        }

        return choice;
    }

    public static void FtoC() {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter 1 to convert F-C or 2 to convert C-F: ");
        int conv = kb.nextInt();

        double low = 0;
        double high = 0;

        if (conv == 1) {
            System.out.print("\nEnter the lowest temperature: ");
            low = kb.nextDouble();

            System.out.print("\nEnter the highest temperature: ");
            high = kb.nextDouble();
        } else if (conv == 2) {
            System.out.print("\nEnter the lowest temperature: ");
            low = kb.nextDouble();

            System.out.print("\nEnter the highest temperature: ");
            high = kb.nextDouble();
        } else {
            System.out.println("Invalid input.");
        }

        double fahrenheight;
        System.out.println("\nCelcius\t\tFahrenheight:");

        for (double first_temp = low; first_temp <= high; first_temp++) {
            fahrenheight = (first_temp * 9 / 5.0) + 32;
            System.out.println(first_temp + "\t\t" + fahrenheight);
        }
    }

    public static void FtoM() {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter 1 to convert F-M or 2 to convert M-F: ");
        int conv = kb.nextInt();

        double low = 0;
        double high = 0;

        if (conv == 1) {
            System.out.print("\nEnter the lowest distance: ");
            low = kb.nextDouble();

            System.out.print("\nEnter the highest distance: ");
            high = kb.nextDouble();
        } else if (conv == 2) {
            System.out.print("\nEnter the lowest distance: ");
            low = kb.nextDouble();

            System.out.print("\nEnter the highest distance: ");
            high = kb.nextDouble();
        } else {
            System.out.println("Invalid input.");
        }

        double miles;
        System.out.println("\nFeet\t\tMiles:");

        for (double first_dist = low; first_dist <= high; first_dist++) {
            miles = first_dist / 5280.0;
            System.out.println(first_dist + "\t\t" + miles);
        }
    }
}