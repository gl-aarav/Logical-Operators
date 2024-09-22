import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String answer;
 System.out.println("This program may contain a virus. Do you wish to continue (y/n)?");
 answer = in.nextLine();
 if (answer.equalsIgnoreCase("y"))
	 System.out.println("You are"
	 		+ " a gambler!");
 else if (answer.equalsIgnoreCase("n"))
	 System.out.println("Smart choice!");
 else 
	 System.out.println("That was not a Y or N. You did not answer correctly!");
  }
}