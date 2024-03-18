package com.fdmgroup.hangman;
import java.util.Arrays;
import java.util.Random;

// Package which chooses the random word
public class RandomWordGenerator {
	private final String[] WORD_LIST = {"COMPUTER", "FURRY", "BASKETBALL", "PLAYER", "UNLUCKY", "TEST"};  // Random words to be used
	private final int LIST_LENGTH = WORD_LIST.length;
	
	
	// Default constructor 
	public RandomWordGenerator() {
	}
	
	
	// Getters and setters 
	public String[] getWORD_LIST() {
		return WORD_LIST;
	}
	

	// Method to get random word
	String getRandomWord() {
		Random random = new Random();
		int randInt = random.nextInt(LIST_LENGTH);
		String randomWord = WORD_LIST[randInt];
		return randomWord;
	}
	
	// Override 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(WORD_LIST);
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
		RandomWordGenerator other = (RandomWordGenerator) obj;
		return Arrays.equals(WORD_LIST, other.WORD_LIST);
	}

	
			
	
	
}
