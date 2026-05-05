// Shaurya Jain
// GuessingGame.java
/*You are playing a game in which the computer has chosen a random number from 1 to 10.
Your job is to guess it.

You need to use a while loop to ask the user for a number.
If your guess is wrong, the computer should display a message that you are too high or too low.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10) + 1;
        int guess = 67;

        while (guess != num) {
            System.out.print("Your guess (1-10): ");
            guess = kb.nextInt();

            if (guess < num) {
                System.out.println("Your number is too low, guess higher.\n");
            } else if (guess > num) {
                System.out.println("Your number is too high, guess lower.\n");
            }
        }
        
        System.out.print("Your guess was correct, good job!");
    }
}

/* Output:
Your guess (1-10): 2
Your number is too high, guess lower.

Your guess (1-10): 4
Your number is too high, guess lower.

Your guess (1-10): 1
Your guess was correct, good job!
*/