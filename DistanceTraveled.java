// Shaurya Jain
// DistanceTraveled
/* Write a program that asks for the speed of a vehicle (in miles – per – hour) and the
number of hours it has traveled.  It should use a while loop to display the distance a
vehicle has traveled for each hour of a time period specified by the user. */

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the speed of the vehicle in miles per hour: ");
        double speed = kb.nextDouble();

        System.out.print("Enter the number of hours traveled: ");
        int hoursInt = kb.nextInt();
        int hours = 1;

        System.out.println("\n\tHour\tDistance Traveled");

        while (hours <= hoursInt) {
            double distance = speed * hours;
            System.out.println("\n\t" + hours + ":\t" + distance + " miles");
            hours++;
        }
    }
}

/* Output (40 mph; 3 hrs)
Enter the speed of the vehicle in miles per hour: 40
Enter the number of hours traveled: 3

	Hour	Distance Traveled

	1:	40.0 miles

	2:	80.0 miles

	3:	120.0 miles
*/

/* Output (65 mph; 5 hrs)
Enter the speed of the vehicle in miles per hour: 65
Enter the number of hours traveled: 5

	Hour	Distance Traveled

	1:	65.0 miles

	2:	130.0 miles

	3:	195.0 miles

	4:	260.0 miles

	5:	325.0 miles
*/