package rs.math.oop1.z110102.rukovanjeIzuzecima.z05.metodiBlokovi;

import java.io.IOException;

public class PokretanjeTryCatch07Block {
	// Divide method
	public static int podeli(int[] array, int index) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		System.out.println("\nFirst try block in divide() entered");
		array[index + 2] = array[index] / array[index + 1];
		System.out.println("Code at end of first try block in divide()");
		return array[index + 2];
	}

	public static void main(String[] args) {
		int[] x = { 10, 5, 0 }; // Array of three integers

		// This block only throws an exception if method divide() does
		try {
			System.out.println("First try block in main() entered");
			System.out.println("result = " + podeli(x, 0)); // No error
			x[1] = 0; // Will cause a divide by zero
			System.out.println("result = " + podeli(x, 0)); // Arithmetic error
			x[1] = 1; // Reset to prevent divide by zero
			System.out.println("result = " + podeli(x, 1)); // Index error
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic exception or Index out of bounds exception caught in main()");
		} catch (Exception e) {
			System.out.println("Exception caught in main()");
		}

		System.out.println("Outside first try block in main()");
		System.out.println("\nPress Enter to exit");

	}

}
