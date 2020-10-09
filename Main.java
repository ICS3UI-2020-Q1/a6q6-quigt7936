/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
  }
}import java.util.Scanner;
/**
 * This program creates the fibonacci sequence
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the number they want
    System.out.println("What Fibonacci number would you like to find");
    // add 1 because the fibonacci sequence starts at 0, so the array needs to include that
    int userNumber = input.nextInt() + 1;

    // create the array and give the first two indexes value
    int[] fibonacci = new int[userNumber];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    
    // give each index value up to the number they want
    for (int i = 2; i < userNumber; i++) {
      fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
    }

    // tell them their indexes number
    // subtract 1 from the userNumber because we added 1 at the begining to fix the 0 zero problem
    System.out.println("The " + (userNumber - 1) + " Fibonacci number is " + fibonacci[userNumber - 1]);
    
  }
}

