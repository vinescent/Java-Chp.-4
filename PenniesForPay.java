// Shaurya Jain
// PenniesForPay.java
// Use a while loop and an accumulator to calculate a persons salary if their pay doubled each day.

import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Welcome to the pay calculator.");
        System.out.print("Enter the amount of days worked: ");
        int daysInt = kb.nextInt();

        while (daysInt < 1) {
            System.out.print("Please enter a valid amount of working days: ");
            daysInt = kb.nextInt();
        }

        int days = 1;
        double salary = 0.01;

        while (days <= daysInt) {
            System.out.printf("\nYou worked " + days + " days and made $%.2f", salary);
            days++;
            salary = salary*2;
        }
    }
}
