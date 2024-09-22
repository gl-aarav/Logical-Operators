import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int side1, side2, side3;
    System.out.println("What is the length of the first side of the triangle?");
    side1 = in.nextInt();
   System.out.println("What is the length of the second side of the triangle?");
    side2 = in.nextInt();
    System.out.println("What is the length of the third side of the triangle?");
    side3 = in.nextInt();
    if (side1+side2<=side3 || side2+side3<=side1 || side1+side3<=side2)
      System.out.println("\nThat is not a triangle.");
    else {
      if (side1==side2 && side2==side3 && side1==side3)
        System.out.println("\nIt is an equilateral triangle.");
      else if (side1==side2 || side2==side3 || side1==side3)
        System.out.println("\nIt is an isoscles triangle.");
      else 
        System.out.println("\nIt is an scalene triangle.");
    
    }
  }
}