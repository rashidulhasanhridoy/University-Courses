package com.example.hridoy;

import java.util.Scanner;

public class GuessNumberOneTime {
	
	public static void main(String args[]) {
		
		int number = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magie number between 0 and 100?");
		System.out.println("\nEnter your guess: ");
		int guess= input.nextInt();
		if(guess == number)
		{
			System.out.println("Yes, the number is " + number);
		}
		
		else if(guess > number) {
			System.out.println("Your guess is too high.");
		}
		
		else {
			System.out.println("Your guess is too low.");
		}
		
	}

}
