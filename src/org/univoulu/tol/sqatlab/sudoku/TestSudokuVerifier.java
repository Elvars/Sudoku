package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	public String candidate;
	
	@Test
	public void verifySudokuString() {
		
		//arrange
		
		
		//act
		SudokuVerifier.verify(candidate);
		
		//assert
		assertEquals(0, 0);
	}

}
