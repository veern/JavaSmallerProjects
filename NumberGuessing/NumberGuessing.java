import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import Exceptions.InvalidDifficultyException;

public class NumberGuessing {

    private static final String EASY = "easy";
    private static final String MEDIUM = "medium";
    private static final String HARD = "hard";


    Scanner scanner = new Scanner(System.in);
    private int numberToGuess;
    private int userGuess;
    private boolean isGuessedCorrectly = false;
    private int numberOfGuessesAlreadyMade = 0;
    private HashMap<String, Integer> difficulties = new HashMap<String, Integer>() {{
        put(EASY, 10);
        put(MEDIUM, 50);
        put(HARD, 100);
        }
    };

    public static void main(String[] args) {
        NumberGuessing numberGuessingGame = new NumberGuessing();
        numberGuessingGame.startGame();
    }
    
    private void startGame() {
        chooseDifficulty();
        guessTheNumber();
        this.scanner.close();
        System.out.println("You won! It took you " + this.numberOfGuessesAlreadyMade + " tries!");
    }

    private int prepareRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    private void chooseDifficulty() {
        System.out.println("Hello, what is the difficulty level You want to choose? (easy, medium, hard):");
        String difficulty = scanner.nextLine().toLowerCase();
        if (!difficulties.containsKey(difficulty)) {
            throw new InvalidDifficultyException(difficulty);
        }
        int range = difficulties.get(difficulty);
        this.numberToGuess = prepareRandomNumber(0, range);
    }

    private void guessTheNumber() {
        System.out.println("Guess the number!");
        while (!isGuessedCorrectly) {
            try {
                this.userGuess = Integer.parseInt(scanner.nextLine());
                this.numberOfGuessesAlreadyMade++;
                if (this.userGuess == numberToGuess) {
                    isGuessedCorrectly = true;
                } else if (this.userGuess > numberToGuess) {
                    System.out.println("You guessed too high. Try again:");
                } else {
                    System.out.println("You guessed too low. Try again:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer:");
            }
        }
    }
}