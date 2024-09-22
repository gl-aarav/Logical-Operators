import java.util.Scanner;
public class Q2 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int integer;
    System.out.println ("Enter an integer between 50 and 100.");
  
    integer = in.nextInt();
    if (integer<=100 && integer>=50)
      System.out.println("You won " + integer + " dollars.");
    else
      System.out.println("Sorry, you are not following directions!");
    }
}