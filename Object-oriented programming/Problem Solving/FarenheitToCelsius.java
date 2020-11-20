package com.example.hridoy;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in farenheit : ");
		double farenheit = input.nextInt();
		double celsius = (5.0 / 9) * (farenheit - 32);
		System.out.println("Farenheit " + farenheit + " is " + celsius + " in Celsius");

	}

}
