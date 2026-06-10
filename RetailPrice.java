// Shaurya Jain
// RetailPrice
// This program calculates and displays the retail price of an item based on its wholesale cost and markup percentage.

import java.util.Scanner;

public class RetailPrice {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the item's wholesale cost: ");
        double wholesaleCost = keyboard.nextDouble();

        System.out.print("Enter the item's markup percentage: ");
        double markupPercentage = keyboard.nextDouble();

        double retailPrice = calculateRetail(wholesaleCost, markupPercentage);

        System.out.printf("The item's retail price is %.2f\n", retailPrice);
    }

    public static double calculateRetail(double wholesale, double markupPercent) {
        double markupAmount = wholesale * (markupPercent / 100.0);
        return wholesale + markupAmount;
    }
}

/*
Enter the item's wholesale cost: 5.00
Enter the item's markup percentage: 100
The item's retail price is 10.00

Enter the item's wholesale cost: 5.00
Enter the item's markup percentage: 50
The item's retail price is 7.50
*/