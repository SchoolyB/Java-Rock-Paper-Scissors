import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter 0 for rock, 1 for paper and 2 for scissors");
    Scanner newScan = new Scanner(System.in); // declaring input object for user
    int userScanInput = newScan.nextInt(); // taking a int value from the user

    int[] arr = new int[] { 0, 1, 2 };// giving computer its possible options
    Random random = new Random(); // creating new random variable
    int compRandomString = random.nextInt(arr.length); // this int takes a random index place from the options array

    int r = 0;
    int p = 1;
    int s = 2;

    String rock = r + "Rock"; // converting integer to string
    String paper = p + "Paper"; // converting integer to string
    String scissors = s + "Scissors"; // converting integer to string

    // COMPUTER decision conditions
    if (compRandomString == 0) {
      String compAction = rock; // could just use string "rock"
      System.out.println(compAction);
    } else if (compRandomString == 1) {
      String compAction = paper;
      System.out.println(compAction);
    } else {
      String compAction = scissors;
      System.out.println(compAction);
    }

    // USER decision conditions
    if (userScanInput == 0) {
      String userAction = rock;
      System.out.println(userAction);

    } else if (userScanInput == 1) {
      String userAction = paper;
      System.out.println(userAction);
    } else {
      String userAction = scissors;
      System.out.println(userAction);

    }

    // Win or lose conditions
    if (userScanInput == compRandomString) {
      System.out.println("Draw you both picked" + compRandomString);
    } else if (userScanInput == 0) {
      if (compRandomString == 2) {
        System.out.println("you picked rock and the computer picked scissors you win");
      } else {
        System.out.println("you picked rock and the computer picked paper you lose");
      }
    } else if (userScanInput == 1) {
      if (compRandomString == 0) {
        System.out.println("you picked paper and the computer picked rock you win ");
      } else {
        System.out.println("you picked paper and the computer picked scissors you lose");
      }
    } else if (userScanInput == 2) {
      if (compRandomString == 1) {
        System.out.println("you picked scissors and the computer picked rock you win ");
      } else {
        System.out.println("you picked scissors and the computer pick rock you");
      }
    } else if (userScanInput == 0) {
      if (compRandomString == 1) {
        System.out.println("you picked rock and the computer picked paper you lose");
      } else {
        System.out.println("you picked rock and the computer picked scissors you win");
      }
    } else if (userScanInput == 1) {
      if (compRandomString == 2) {
        System.out.println("you picked paper and the computer picked scissors you lose");
      } else {
        System.out.println("you picked paper and the computer picked rock you win");
      }
    } else if (userScanInput == 2) {
      if (compRandomString == 0) {
        System.out.println("you picked scissors and the computer picked rock you lose");
      } else {
        System.out.println("you picked scissors and the computer picked paper you win");
      }
    }
  }
}