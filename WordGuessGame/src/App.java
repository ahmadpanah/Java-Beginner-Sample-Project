import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner (System.in);
		
		String secretWord = "programming";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		
		while (!guess.equals(secretWord) && !outOfGuesses) {
			
			if (guessCount < guessLimit) {
				System.out.println("Enter a Guess: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			} else {
				outOfGuesses = true;
			}
			
		}
		if (outOfGuesses) {
			System.out.println("You Lose! no more Guess!");
		} else {
			System.out.println("You Win!");
		}
		
	}

}
