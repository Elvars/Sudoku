package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays; 

public class SudokuVerifier {
	
	public static String correctSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	public static int rowOne[];
	public static int rowTwo[];
	public static int rowThree[];
	public static int rowFour[];
	public static int rowFive[];
	public static int rowSix[];
	public static int rowSeven[];
	public static int rowEight[];
	public static int rowNine[];
	
	public static int [] allArrays [] = {rowOne};
	
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
	
	
	public static String splitString(String candidateSolution)
	{
		for(int i=0; i<9; i++)
		{
			allArrays[0][i] = candidateSolution.charAt(i);
		}
		
		return Arrays.toString(allArrays[0]);
	}
	
	
	public static boolean isPositive(int candidateNumber)
	{
		if(candidateNumber<0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	public static int checkStringLenght(String candidateSolution)
	{
		if(candidateSolution.length()<81 || candidateSolution.length()>81)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
