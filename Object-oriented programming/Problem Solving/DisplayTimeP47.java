package com.example.hridoy;

import java.util.Scanner;

public class DisplayTimeP47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an iteger for seconds : ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingseconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingseconds + " seconds");

	}

}
