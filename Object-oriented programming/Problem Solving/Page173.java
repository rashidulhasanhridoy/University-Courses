package com.example.hridoy;

import java.util.Scanner;

public class Page173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int number , sum = 0, count;
		
		for(count = 0; count < 5; count++) {
			number = input.nextInt();
			sum += number;
		}
		
		System.out.println("sum is " + sum);
		System.out.println("count is " + count);

	}

}
