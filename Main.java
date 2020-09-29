/*SamHunkler
Jacob Leusch
Brittany Posner
Jacob Warner
*/
import java.util.*;

class Main {
  public static void main(String[] args) {
    int range;
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please Enter Any Whole Number");
    range = s.nextInt();
    createRange(range);
    int number = r.nextInt(range);
    System.out.println("A Random Number has been Generated!");
    playGame(number, range);

  }

  static int createRange(int theRange) {
    theRange ++;
    return theRange;
  }

  static void playGame(int theNumber, int theRange) {
   int tries = 1;
   int guess;
   Scanner s = new Scanner(System.in);
   System.out.println("Please guess a number between 0 and " + theRange);
   guess = s.nextInt();
   while(guess != theNumber){
   if (guess < theNumber)
      System.out.println("Guess Higher!");
   else 
      System.out.println("Guess Lower!");
    System.out.println("Enter your new Guess!");
    guess = s.nextInt();
    tries ++;
    }
    System.out.println("Great! You win! it took you " + tries + " tries");

  }

}