package Exceptions;
public class InvalidDifficultyException extends RuntimeException {
    public InvalidDifficultyException(String difficulty) {
        super("Invalid Difficulty Setting: " + difficulty);
    }    
}
