package com.example.hridoy;

public class ShowCurrentTimeP52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currenHours = totalHours % 24;
		
		System.out.println("Current time is " + currenHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");

	}

}
