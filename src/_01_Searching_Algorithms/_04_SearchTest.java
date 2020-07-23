package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words= {"duck", "goose", "roar", "quad", "precious"};
		
		assertEquals(0, _00_LinearSearch.linearSearch(words, "duck"));
		assertEquals(1, _00_LinearSearch.linearSearch(words, "goose"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "banana"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
String[] words= {"duck", "goose", "roar", "quad", "precious"};
		
		assertEquals(0, _01_BinarySearch.binarySearch(, 0, 0, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(null, 0, 0, 0));
		assertEquals(-1, _01_BinarySearch.binarySearch(null, 0, 0, 0));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
