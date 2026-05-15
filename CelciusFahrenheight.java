// Shaurya Jain
// CelciusFarenheight.java
// The purpose of this program is to demonstrate your knowledge of the for loop.

import java.util.Scanner;

public class CelciusFahrenheight {
    public static void main(String[] args) {
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

        double fahrenheight = 0;
        System.out.println("\nCelcius\t\tFahrenheight:");

        for (double first_temp = low; first_temp <= high; first_temp++) {
            fahrenheight = (first_temp * 9 / 5.0) + 32;
            System.out.println(first_temp + "\t\t" + fahrenheight);
        }
    }
}

/* Output:
Enter 1 to convert F-C or 2 to convert C-F: 1

Enter the lowest temperature: 4

Enter the highest temperature: 19

Celcius		Fahrenheight:
4.0		39.2
5.0		41.0
6.0		42.8
7.0		44.6
8.0		46.4
9.0		48.2
10.0		50.0
11.0		51.8
12.0		53.6
13.0		55.4
14.0		57.2
15.0		59.0
16.0		60.8
17.0		62.6
18.0		64.4
19.0		66.2

Output:
Enter 1 to convert F-C or 2 to convert C-F: 2

Enter the lowest temperature: 4

Enter the highest temperature: 19

Celcius		Fahrenheight:
4.0		39.2
5.0		41.0
6.0		42.8
7.0		44.6
8.0		46.4
9.0		48.2
10.0		50.0
11.0		51.8
12.0		53.6
13.0		55.4
14.0		57.2
15.0		59.0
16.0		60.8
17.0		62.6
18.0		64.4
19.0		66.2
*/