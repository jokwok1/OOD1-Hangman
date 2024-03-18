package com.fdmgroup.hangman;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomWordGenerator randomWord = new RandomWordGenerator(); 
		UserInput userInput = new UserInput(); 
		int guesses = 8; 
		ArrayList<Character> guessedLetters = new ArrayList<Character>();  // ensure the letters guessed kept in an array 
		boolean gameOver = false; //while loop that exits when game is over
		String WORD_TO_GUESS = randomWord.getRandomWord();
		
	
		HangmanGame hangmanGame = new HangmanGame(WORD_TO_GUESS); 
		String guessedWordtoString = hangmanGame.guessedWordtoString();
		
		System.out.println("Welcome to Hangman!");
		
		// Play Hangman game
		while (!gameOver) {
			System.out.println("The word now looks like this: " + guessedWordtoString);
			System.out.println("You have " + guesses + " guesses left.");
			char charInput = userInput.processInput(); 

			// Check if letters already guessed 
			if (guessedLetters.contains(charInput)) {
				System.out.println("You have already guessed the letter " + charInput);
				continue;
			}
			
			// Check if letter exists in the random word
			guessedLetters.add(charInput);// save the guessed letters in the array 
			boolean letterExist = hangmanGame.checkGuess(charInput);
			if (letterExist) {
				System.out.println("That guess is correct.");
				guessedWordtoString = hangmanGame.guessedWordtoString();
			}
			else if (!letterExist) {
				System.out.println("There are no " + charInput + "'s in this word.");
				guesses--;
			}
			
			
			// check if the game is finished 
			if (guessedWordtoString.equals(WORD_TO_GUESS)) {
				System.out.println("You guessed the word: " + WORD_TO_GUESS + "\nYou win.");
				gameOver = true;			
			} else if (guesses <= 0) {
				System.out.println("You're completely hung.\nThe word was: " + WORD_TO_GUESS + "\nYou lose.");
				gameOver = true;
			} 
			
		}
		
		

		
	}

}
