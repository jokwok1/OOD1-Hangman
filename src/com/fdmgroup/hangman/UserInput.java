package com.fdmgroup.hangman;
import java.util.Scanner;

public class UserInput {
	// prepare and open scanner class for reading
	Scanner scanner = new Scanner(System.in);
	
	

	public UserInput() {
	}


	// get the letter from the user input
	public char processInput() {
		System.out.print("Your guess: ");
		char charInput = Character.toUpperCase(scanner.next().charAt(0));
		return charInput;

	}
	
	
	
	
	
}
