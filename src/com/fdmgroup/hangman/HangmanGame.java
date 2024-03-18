package com.fdmgroup.hangman;

import java.util.Arrays;
import java.util.Objects;

public class HangmanGame {
	private String word; 
	private char[] guessedWord; // display the current progress 
	private char[] wordChar; //word converted into a char Array
	private int wordLength; 
	
	// Custom constructor 
	public HangmanGame(String word) {
		this.word = word;
		this.wordChar = word.toCharArray();
		this.wordLength = word.length();
		this.guessedWord = new char[wordLength];
		for (int i = 0; i < wordLength; i++) {
			this.guessedWord[i] = '-';
	    }
	}
	
	public boolean checkGuess(char letter) {
		boolean letterExist = false;
		for (int i = 0; i < wordLength; i++) {
			if (letter == wordChar[i]) {
				letterExist = true;
				guessedWord[i] = letter;	
			}
		}
		return letterExist;
	}
	
	// getters and setters
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	public char[] getGuessedWord() {
		return guessedWord;
	}
	public void setGuessedWord(char[] guessedWord) {
		this.guessedWord = guessedWord;
	}
	public char[] getWordChar() {
		return wordChar;
	}
	public void setWordChar(char[] wordChar) {
		this.wordChar = wordChar;
	}
	
	public String guessedWordtoString() {
		String guessedWordString = new String(guessedWord);
		return guessedWordString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(guessedWord);
		result = prime * result + Arrays.hashCode(wordChar);
		result = prime * result + Objects.hash(word, wordLength);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangmanGame other = (HangmanGame) obj;
		return Arrays.equals(guessedWord, other.guessedWord) && Objects.equals(word, other.word)
				&& Arrays.equals(wordChar, other.wordChar) && wordLength == other.wordLength;
	}
	
	
	
	
}
