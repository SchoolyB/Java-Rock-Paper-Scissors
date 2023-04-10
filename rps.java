import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Please choose either rock, paper, or scissors");
    Scanner userInput = new Scanner(System.in); // declaring input object for user
    String userAction = userInput.next(); // taking a string value from the user

    String[] options = new String[] { "Rock", "Paper", "Scissors" };// giving computer its possible options
    Random r = new Random(); // creating new random variable
    int randomString = r.nextInt(options.length); // this int takes a random index place from the options array

    String rock = "Rock";
    String paper = "Paper";
    String scissors = "Scissors";

    String compAction = Integer.toString(randomString);

    System.out.println(userAction);
    System.out.println(compAction); // TODO: need to figure out why comp action wont print out a string

    if (userAction == compAction) {
      System.out.println("Draw! you both chose" + compAction);
    } else if (userAction == rock) {
      if (compAction == scissors) {
        System.out.println("You chose rock and the computer chose paper");
        System.out.println("rock smashes scissors. You Win!!!");
      } else {
        System.out.println("you chose rock and the computer chose paper.");
        System.out.println("paper covers rock. You Lose!!!");
      }
    } else if (userAction == paper) {
      if (compAction == rock) {
        System.out.println("You chose paper and the computer chose rock.");
        System.out.println("paper covers rock. You Win!!!");
      } else {
        System.out.println("you chose paper and the computer chose scissors.");
        System.out.println("scissors cuts paper. You Lose!!!");
      }
    } else if (userAction == scissors) {
      if (compAction == paper) {
        System.out.println("You chose scissors and the computer chose paper.");
        System.out.println("scissors cuts paper. You Win!!!");
      } else {
        System.out.println("you chose scissors and the computer chose rock.");
        System.out.println("rock smashes scissors. You Lose!!!");
      }

      System.out.println("The computer chose" + options[randomString] + "and you chose ");// print random string from
                                                                                          // the
                                                                                          // options array
    }
  }
}
