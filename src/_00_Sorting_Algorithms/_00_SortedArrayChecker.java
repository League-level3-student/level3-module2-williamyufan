package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	static boolean intArraySorted(int[] integers) {
		for (int i = 0; i < integers.length-1; i++) {

			if (integers[i + 1] < integers[i]){

				return false;
			}
		}
		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] doubl) {
		for (int i = 0; i < doubl.length-1; i++) {

			if (doubl[i + 1] < doubl[i]) {

				return false;
			}
		}

		return true;

	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean charArraySorted(char[] characters) {
		for (int i = 0; i < characters.length-1; i++) {

			if (characters[i + 1] < characters[i]) {

				return false;
			}
		}
		return true;

	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] strings) {
		for (int i = 1; i < strings.length; i++) {
			if (!(0 > strings[i - 1].compareTo(strings[i]))) {

				return false;

			}

		}
		return true;
	}

}
