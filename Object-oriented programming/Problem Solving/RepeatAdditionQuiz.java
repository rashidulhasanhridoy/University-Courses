package com.example.hridoy;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 +" + " + number2 + " ?");
		int answer = input.nextInt();
		
		while(number1 + number2 != answer) {
			System.out.println("What is " + number1 +" + " + number2 + " ?");
			 answer = input.nextInt();
		}
		
		System.out.println("You got it!");

	}

}
