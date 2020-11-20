package com.example.hridoy;

public class FutureTution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tution = 10000;
		int year = 0;
		while(tution < 20000) {
			tution = tution * 1.07;
			year++;
		}
		
		System.out.println("Tution will be doubled in " + year + " years");
		System.out.printf("Tution will be doubled $ %.2f in %1d years", tution, year);

	}

}
