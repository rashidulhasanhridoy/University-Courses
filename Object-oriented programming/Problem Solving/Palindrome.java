package com.example.hridoy;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		int low = 0;
		int high = s.length() - 1;
		boolean isPalidrome = true;
		while(low < high) {
			if(s.charAt(low) != s.charAt(high)){
				isPalidrome = false;
				break;
	
			}
			low++;
			high--;
		}
		
		if(isPalidrome)
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");

	}

}
