package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	public static String correctSolution;

	public static int verify(String candidateSolution) {
		
		
		if(candidateSolution==correctSolution)
		{
			// returns 1 if the candidate solution is correct
			return 1;
		}
		
		return 0;
	}
}
