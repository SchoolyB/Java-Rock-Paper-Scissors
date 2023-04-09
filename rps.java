import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] options = new String[] { "Rock", "Paper", "Scissors" };// giving computer its possible options
    Scanner userInput = new Scanner(System.in); // declaring input object for user

    System.out.println("Please choose either rock, paper, or scissors");
    userInput.next();

    Random generatedRandom = new Random();
    System.out.println(generatedRandom.nextInt(100)); // specify random range of random numbers to choose from

  }
}
