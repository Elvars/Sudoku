package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SudokuVerifier {
	
	public static String correctSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	public static int rowOne[] = new int[9];
	public static int rowTwo[] = new int[9];
	public static int rowThree[] = new int[9];
	public static int rowFour[] = new int [9];
	public static int rowFive[]= new int [9];
	public static int rowSix[]= new int [9];
	public static int rowSeven[]= new int [9];
	public static int rowEight[]= new int [9];
	public static int rowNine[]= new int [9];
	
	public static int [] allArrays [] = {rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix, rowSeven, rowEight, rowNine};
	
	static boolean result=false;
	
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
		char[] chars = new char[100];
		chars = candidateSolution.toCharArray();
		int z = 0;
		
		for(int i=0; i<9; i++)
		{
			for(int y=0; y<9; y++)
			{	
				allArrays[i][y] = chars[z];
				z++;
			}
			
		}
		
		return Arrays.toString(allArrays);
		
	}
	
	
	public static int checkHorizontal()
	{
		String subString;
		
		for(int i=0; i<1; i++)
		{
			subString = allArrays[i].toString();
			
			if(!uniqueString(subString))
			{
				return 0;
			}
		}
		
		return 1;
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
	
	
	public static boolean uniqueString(String candidateSolution)
	{
		HashSet < Character> uniquecharset= new HashSet();
        for(int i=0;i < candidateSolution.length();i++)
        {
            result=uniquecharset.add(candidateSolution.charAt(i));
            if (result == false)
            	break;
            
        }
        
        return result;
	}
}
