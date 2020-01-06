/*
URI 1017
	Little John wants to calculate and show the amount of spent fuel liters on a trip, using a car that does 12 Km/L. 
	For this, he would like you to help him through a simple program. 
	To perform the calculation, you have to read spent time (in hours) and the same average speed (km/h). 
	In this way, you can get distance and then, calculate how many liters would be needed. 
	Show the value with three decimal places after the point.
*/
package com.generation.uri1017;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer time, speed;
		float fuel;
		Scanner reader = new Scanner(System.in);

		time = reader.nextInt();
		speed = reader.nextInt();
		fuel = (time*speed) / 12f;

		System.out.printf("%.3f\n", fuel);
	}
}
