// Shaurya Jain
// AverageGrades.java
// Demonstrate your knowledge of loops, sentinel values, accumulators,
// count control variables, and conditional statements.

import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int numGrades = 1;
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        boolean stop = false;

        while (!stop && numGrades <= 3) {
            System.out.print("Enter one of a grade or enter -99 to end the program: ");
            
            double grade = kb.nextDouble();
            
            if (grade == -99) {
                stop = true;
            } else if (numGrades == 1) {
                grade1 = grade;
                numGrades++;
            } else if (numGrades == 2) {
                grade2 = grade;
                numGrades++;
            } else if (numGrades == 3) {
                grade3 = grade;
                numGrades++;
            }
        }

        double sum = grade1 + grade2 + grade3;
        int gradesEntered = numGrades - 1;
        double average = sum / gradesEntered;
        
        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("\nThe sum of the grades is: " + sum);
        System.out.println("The number of grades entered is: " + gradesEntered);
        System.out.printf("Your average is: %.2f\n", average);
        System.out.println("Your letter grade is: " + letterGrade);
    }
}

/* Output:
Enter one of a grade or enter -99 to end the program: 71
Enter one of a grade or enter -99 to end the program: 80
Enter one of a grade or enter -99 to end the program: 90

The sum of the grades is: 241.0
The number of grades entered is: 3
Your average is: 80.33
Your letter grade is: B
*/