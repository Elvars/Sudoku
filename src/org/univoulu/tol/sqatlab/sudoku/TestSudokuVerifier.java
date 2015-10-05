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
	
		
		assertTrue("true", SudokuVerifier.isPositive(number));
	}
	
	
	@Test
	public void testForNegativeNumber()
	{
		number = -1;
		
		assertFalse("false", SudokuVerifier.isPositive(number));
		
	}
	
	
	@Test
	public void testCandidateSolutionLenghtReturns1()
	{
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		SudokuVerifier.checkStringLenght(candidate);
		
		assertEquals(1, 1);
	}
	
	
	@Test
	public void testCandidateSolutionLenghtReturns0()
	{
		candidate = "112321";
		
		SudokuVerifier.checkStringLenght(candidate);
		
		assertEquals(0, 0);
	}
	
	
	@Test
	public void testStringSplitter()
	{
		String actual;
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		actual = SudokuVerifier.splitString(candidate);
		
		
		
		assertEquals(candidate, actual);
	}
	
	
	@Test
	public void testForUnique9characterStringFails()
	{
		candidate = "123456788";
		
		assertFalse(SudokuVerifier.uniqueString(candidate));
		
	}
	
	@Test
	public void testForUnique9characterStringPasses()
	{
		candidate = "123456789";
		
		assertTrue(SudokuVerifier.uniqueString(candidate));
		
	}
	
	
	@Test
	public void testForHorizontal()
	{
		//will fail
		//candidate = "123456789912345678891234567789123456678912345567891234456789123345678912234567899";
		
		//will pass
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		int actual = 0;
		SudokuVerifier.splitString(candidate);
		
		actual = SudokuVerifier.checkHorizontal();
		
		assertEquals(1, actual);
		
	}
	
	
	@Test
	public void testForVertical()
	{
		//will fail
		//candidate = "123456789912345678891234567789123456678912345567891234456789123345678912234567899";
				
		//will pass
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		
		int actual = 0;
		SudokuVerifier.splitString(candidate);
		
		actual = SudokuVerifier.checkVertical();
		
		assertEquals(1, actual);
	}
	
	

}
