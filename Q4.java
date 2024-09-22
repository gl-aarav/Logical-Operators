import java.util.Scanner;
public class Q4 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 int average, discinf, courses;
 System.out.println("What is your average?");
 average = in.nextInt();
 System.out.println("How many discipline infractions do you have?");
discinf = in.nextInt();
  System.out.println("How many courses do you are taking?");
  courses=in.nextInt();
  if (courses >= 5 && discinf==0 && average>=90)
	  System.out.println("You are eligible for the honor roll!");
  else 
	  System.out.println("You are not eligible for the honor roll.");
  }
}