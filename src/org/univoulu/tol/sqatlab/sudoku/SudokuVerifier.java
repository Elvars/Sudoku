package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	public static String correctSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	public static int verify(String candidateSolution) {
		
		
		if(candidateSolution==correctSolution)
		{
			// returns 1 if the candidate solution is correct
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	public boolean isPositive(int number)
	{
		return 0;
	}
}
