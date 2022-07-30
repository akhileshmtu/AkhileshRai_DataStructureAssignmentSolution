package com.gl.skyscraper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// "Enter Number of sections:
		System.out.println("Enter the total no of floors in the building : ");
		int n = sc.nextInt();

		int arr[] = new int[n + 1];
		// Create array for no of days
		for (int i = 1; i < n + 1; i++) {

			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			arr[m] = i;

		}

		int j = n;

		boolean flag;
		System.out.println("The order of construction is as follows ");
		for (int i = 1; i < n + 1; i++) {
			flag = false;
			System.out.println("Day: " + i);

			while (j >= 1 && arr[j] <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if (flag == true) {
				System.out.println();
			}

		}

	}
}
