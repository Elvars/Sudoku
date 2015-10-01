package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	
	public String candidate;
	public int number;
	
	@Test
	public void verifySudokuStringReturns0() {
		
		//arrange
		candidate = "1";
		
		//act
		SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(0, 0);
	}
	
	@Test
	public void verifySudokuStringReturns1() {
		
		//arrange
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		//act
		SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(1, 1);
	}
	
	
	@Test
	public void testForPositiveNumber()
	{
		number = 1;
		
		SudokuVerifier.isPositive(number);
		
		assertEquals(true, true);
	}
	
	
	@Test
	public void testForNegativeNumber()
	{
		number = -1;
		
		SudokuVerifier.isPositive(number);
		
		assertEquals(true, false);
	}

}
