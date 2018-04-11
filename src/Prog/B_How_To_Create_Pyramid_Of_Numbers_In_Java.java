package Prog;

import java.util.Scanner;

public class B_How_To_Create_Pyramid_Of_Numbers_In_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Lines in Pyramid : ");
		int noOfRows = sc.nextInt();
		int rowCount = 1;

		Pyramid_5(noOfRows, rowCount);

	}

	public static void Pyramid_1(int noOfRows, int rowCount) {

		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= rowCount; k++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;
		}

	}

	public static void Pyramid_2(int noOfRows, int rowCount) {
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= rowCount; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			rowCount++;
		}

	}

	public static void Pyramid_3(int noOfRows, int rowCount) {
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= rowCount; k++) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}

	public static void Pyramid_4(int noOfRows, int rowCount) {

		for (int i = noOfRows; i > 0; i--) {
			// Printing i*2 spaces at the beginning of each row

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			// Printing j value where j value will be from 1 to rowCount

			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}

			// Printing j value where j value will be from rowCount-1 to 1

			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

			// Incrementing the rowCount
			rowCount++;
		}
	}

	public static void Pyramid_5(int noOfRows, int rowCount) {
		rowCount = noOfRows;

		for (int i = 0; i < noOfRows; i++) {

			// Printing i*2 spaces at the beginning of each row
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			// Printing j where j value will be from 1 to rowCount
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}

			// Printing j where j value will be from rowCount-1 to 1
			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

			// Decrementing the rowCount
			rowCount--;
		}
	}

}
