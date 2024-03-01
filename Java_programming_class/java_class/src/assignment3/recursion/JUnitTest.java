package assignment3.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class JUnitTest {

	
	@Test
	void test1() {
		RecursionProg1 recursionProg1 = new RecursionProg1();
		recursionProg1.power(4, 2);
		double expectedOutput = 16.0;
		double actualOutput = 16.0;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void test2() {
		RecursionProg2 recursionProg2 = new RecursionProg2();
		recursionProg2.minCharacter("akel");
		char expectedOutput = 'a';
		char actualOutput = 'a';
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void test3() {
		RecursionProg3 recursionProg3 = new RecursionProg3();
		int arr[] = {33,1,22,4,5,65,34,45};
		Arrays.sort(arr);
		int input = 1;
		recursionProg3.search(arr, input);
		int expectedOutput = 0;
		int actualOutput = 0;
		assertEquals(expectedOutput, actualOutput);
	}

}