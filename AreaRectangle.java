// Shaurya Jain
// AreaRectangle
// This program calculates and displays the area of a rectangle.

/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.
import java.util.Scanner;

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }

   public static double getLength()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the rectangle's length: ");
      return keyboard.nextDouble();
   }

   public static double getWidth()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the rectangle's width: ");
      return keyboard.nextDouble();
   }

   public static double getArea(double length, double width)
   {
      return length * width;
   }

   public static void displayData(double length, double width, double area)
   {
      System.out.println("Rectangle Length: " + length);
      System.out.println("Rectangle Width: " + width);
      System.out.println("Rectangle Area: " + area);
   }
}

/*
Enter the rectangle's length: 12.5
Enter the rectangle's width: 4.0
Rectangle Length: 12.5
Rectangle Width: 4.0
Rectangle Area: 50.0
*/