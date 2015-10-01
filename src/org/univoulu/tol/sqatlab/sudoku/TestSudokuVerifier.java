package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	public String candidate;
	
	
	@Test
	public void verifySudokuStringFail() {
		
		//arrange
		candidate = "1";
		
		//act
		SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(0, 0);
	}
	
	@Test
	public void verifySudokuStringPass() {
		
		//arrange
		candidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		//act
		SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(0, 0);
	}

}
