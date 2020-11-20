package com.example.hridoy;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NumberOfPrimes = 50;
		final int NumberOfPrimesPerLine = 10;
		int count = 0;
		int number = 2;
		System.out.println("The first 50 prime number are \n");
		while(count < NumberOfPrimes) {
			boolean  isPrime = true;
			
			for(int divisor = 2; divisor <= number / 2; divisor++) {
				if(number % divisor == 0) {
					isPrime = false;
					break;
				}
				
			}
			
			if(isPrime) {
				count++;
				if(count % NumberOfPrimesPerLine == 0) {
					System.out.println(number);
				}
				else
					System.out.println(number + " ");
			}
			
			number++;
		}

	}

}
