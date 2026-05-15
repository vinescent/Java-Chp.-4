// Shaurya Jain
// BarChart.java
// Use a series of for loops (not nested loops) to create 5 individual bar charts.

import	java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter today's sales for store 1: ");
        int store1 = kb.nextInt();
        
        System.out.print("Enter today's sales for store 2: ");
        int store2 = kb.nextInt();
        
        System.out.print("Enter today's sales for store 3: ");
        int store3 = kb.nextInt();
        
        System.out.print("Enter today's sales for store 4: ");
        int store4 = kb.nextInt();
        
        System.out.print("Enter today's sales for store 5: ");
        int store5 = kb.nextInt();

        System.out.println("\n\nSALES BAR CHART");
        System.out.print("Store 1: ");
        for (int i = 0; i < store1 / 100; i++) {
            System.out.print("*");
        }

        System.out.print("\nStore 2: ");
        for (int i = 0; i < store2 / 100; i++) {
            System.out.print("*");
        }
        
        System.out.print("\nStore 3: ");
        for (int i = 0; i < store3 / 100; i++) {
            System.out.print("*");
        }
        
        System.out.print("\nStore 4: ");
        for (int i = 0; i < store4 / 100; i++) {
            System.out.print("*");
        }
        
        System.out.print("\nStore 5: ");
        for (int i = 0; i < store5 / 100; i++) {
            System.out.print("*");
        }
    }
}

/* Output:
Enter today's sales for store 1: 500
Enter today's sales for store 2: 300
Enter today's sales for store 3: 700
Enter today's sales for store 4: 200
Enter today's sales for store 5: 900

SALES BAR CHART
Store 1: *****
Store 2: ***
Store 3: *******
Store 4: **
Store 5: *********
*/