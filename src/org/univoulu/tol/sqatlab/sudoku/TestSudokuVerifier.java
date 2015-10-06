package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	
	public String candidate;
	public int number;
	public int actual;
	
	@Test
	public void verifySudokuStringReturnsMinusFive() {
		
		//arrange
		candidate = "1";
		actual = 0;
		
		//act
		actual = SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(-5, actual);
	}
	
	@Test
	public void verifySudokuStringReturns0() {
		
		//arrange
		//candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		//will fail
		//candidate = "123456789912345678891234567789123456678912345567891234456789123345678912234567899";
		
		//candidate= "359784612821369745764251839247893561698517324513426987485932176976148253132675498";
		
		candidate = "111111111111111111111111111111111111111111111111111111111111111111111111111111111";
		actual = 0;
		
		//act
		actual = SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(0, actual);
	}
	
	
	@Test
	public void testForPositiveNumber()
	{
		candidate="221211212";
	
		
		assertTrue("true", SudokuVerifier.isPositive(candidate));
	}
	
	
	@Test
	public void testForNegativeNumber()
	{
		candidate="-2322";
		
		assertFalse("false", SudokuVerifier.isPositive(candidate));
		
	}
	
	
	@Test
	public void testCandidateSolutionLenghtReturns1()
	{
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		
		actual = SudokuVerifier.checkStringLenght(candidate);
		
		assertEquals(1, actual);
	}
	
	
	@Test
	public void testCandidateSolutionLenghtReturns0()
	{
		candidate = "112321";
		
		actual = SudokuVerifier.checkStringLenght(candidate);
		
		assertEquals(0, actual);
	}
	
	
	@Test
	public void testStringToArraysSplitter()
	{
		String actualString;
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		actualString = SudokuVerifier.splitStringToArrays(candidate);
		
		
		
		assertEquals(candidate, actualString);
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
		
		actual = 0;
		SudokuVerifier.splitStringToArrays(candidate);
		
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
		
		
		actual = 0;
		SudokuVerifier.splitStringToArrays(candidate);
		
		actual = SudokuVerifier.checkVertical();
		
		assertEquals(1, actual);
	}
	
	
	@Test
	public void testFor3x3Grids()
	{
		//will fail
		//candidate = "123456789912345678891234567789123456678912345567891234456789123345678912234567899";
						
		//will pass
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
					
		actual = 0;
		SudokuVerifier.splitStringToArrays(candidate);
		
		actual = SudokuVerifier.checkMiniGrids();
		
		assertEquals(1, actual);
	}
	
	

}
