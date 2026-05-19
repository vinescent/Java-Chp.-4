//Shaurya Jain
// LargestSmallest.java
// Use a loop (not an array) and a sentinel value to find the smallest and
// largest value in a set of numbers.

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int minVal = 101; 
        int maxVal = 0;   
        int num;

        boolean hasValidData = false;

        while (true) {
            System.out.print("Enter a value (-99 to stop): ");
            num = keyboard.nextInt();
            
            if (num == -99) {
                break;
            }

            if (num < 1 || num > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            } else {
                hasValidData = true;
                
                if (num < minVal) {
                    minVal = num;
                }
                if (num > maxVal) {
                    maxVal = num;
                }
            }
        }

        if (hasValidData) {
            System.out.println("Min: " + minVal);
            System.out.println("Max: " + maxVal);
        } else {
            System.out.println("No valid data entered.");
        }
    }
}

/* Output:
Enter a value (-99 to stop): 67
Enter a value (-99 to stop): 6
Enter a value (-99 to stop): -99
Min: 6
Max: 67
*/