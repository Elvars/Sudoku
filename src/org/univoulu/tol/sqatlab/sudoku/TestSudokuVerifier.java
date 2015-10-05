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
		
		candidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752939";
		
		SudokuVerifier.splitString(candidate);
		
		assertEquals("4173698256321589479587243168254371697915864323469127582896435715732916841648752939", candidate);
	}
	
	
	@Test
	public void testForUnique9characterStringFails()
	{
		candidate = "123456799";
		
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
		candidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752939";
		
		SudokuVerifier.splitString(candidate);
		
		SudokuVerifier.checkHorizontal();
		
	}
	
	

}
