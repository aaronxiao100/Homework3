//Aaron
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Your friend is stuck inside a locked cage.");
        System.out.println("In order to unlock the cage, you need to guess the correct number");
        System.out.println("The system will tell you whether your guessed number was too high or too low! Good luck!");


        int difficultyLevel;
        int maxNumber = 100;
        int numberToGuess;
        int guess = 0;
        int attempt = 0;


        System.out.print("System: Choose your difficulty level (Enter '1' = Easy, '2' = Medium, '3' = Hard): ");
        difficultyLevel = input.nextInt();

        if (difficultyLevel == 1) { //Easy level
            maxNumber = 50;
        } else if (difficultyLevel == 2) { //Medium level
            maxNumber = 100;
        } else if (difficultyLevel == 3) { //Hard level
            maxNumber = 500;
        } else {
            System.out.println("System: Invalid choice, difficulty level will be medium");
            maxNumber = 100;
        }

        numberToGuess = random.nextInt(maxNumber) + 1;
        System.out.println("System: I'm thinking of a number between 1 and " + maxNumber + "! Try and guess it.");

        while (guess != numberToGuess) {
            System.out.print("System: Enter your guess: ");
            guess = input.nextInt();
            attempt += 1;

            if (guess < numberToGuess) { //if the # you guessed was smaller
                if ((numberToGuess - guess) < 5) { // if the # you guessed was close
                    System.out.println("System: You almost got it! Try a little higher!");
                    System.out.println("Friend: Come on, you got this!");
                } else { //if the # you guess was not close
                    System.out.println("System: Too low! Try guessing higher!");
                }
            } else if (guess > numberToGuess) { //if the # you guessed was greater
                if ((guess - numberToGuess) < 5) { //if the # you guess was close
                    System.out.println("System: You almost got it! Try a little lower!");
                    System.out.println("Friend: Come on, you got this!");
                } else { //if the # you guess was not close
                    System.out.println("System: Too high! Try guessing lower!");
                    System.out.println("Friend: Take your time, you got this!");
                }
            } else { //if the # you guessed was correct
                System.out.println("System: You got it! The number was " + numberToGuess + ". You saved your friend!!");
                System.out.println("System: You got it in " + attempt + " attempts!");
                System.out.println("Friend: Thanks for saving me!");
                if (numberToGuess == 67) {
                    System.out.println("6 7");
                }
            }
        }

        input.close();
    }
}