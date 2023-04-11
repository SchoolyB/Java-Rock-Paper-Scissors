import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Please choose either rock, paper, or scissors");
    Scanner userInput = new Scanner(System.in); // declaring input object for user
    String userAction = userInput.next(); // taking a string value from the user

    int[] arr = new int[] { 0, 1, 2 };// giving computer its possible options
    Random random = new Random(); // creating new random variable
    int randomString = random.nextInt(arr.length); // this int takes a random index place from the options array

    int r = 0;
    int p = 1;
    int s = 2;

    String rString = r + "Rock"; // converting integer to string
    String pString = p + "Paper"; // converting integer to string
    String sString = s + "Scissors"; // converting integer to string

    if (randomString == 0) {
      String compAction = "Rock";
      System.out.println(compAction);
    }

    if (randomString == 1) {
      String compAction = "Paper";
      System.out.println(compAction);
    }

    if (randomString == 2) {
      String compAction = "Scissors";
      System.out.println(compAction);
    }

    // System.out.println("The computer chose" + options[randomString] + "and you
    // chose ");// print random string from
    // the
    // options array
  }
}
