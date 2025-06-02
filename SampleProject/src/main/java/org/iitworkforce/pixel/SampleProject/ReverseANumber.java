package org.iitworkforce.pixel.SampleProject;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		        // Input the number
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int reversed = 0;

		        // Reverse the number
		        while (number != 0) {
		            int digit = number % 10;
		            reversed = reversed * 10 + digit;
		            number /= 10;
		        }

		        System.out.println("Reversed number: " + reversed);
		    }

	}


