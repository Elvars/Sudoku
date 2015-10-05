package org.univoulu.tol.sqatlab.sudoku;

import java.util.Arrays;
import java.util.HashSet;

public class SudokuVerifier {
	
	public static String correctSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	public static String rowOne[] = new String[9];
	public static String rowTwo[] = new String[9];
	public static String rowThree[] = new String[9];
	public static String rowFour[] = new String [9];
	public static String rowFive[]= new String [9];
	public static String rowSix[]= new String [9];
	public static String rowSeven[]= new String [9];
	public static String rowEight[]= new String [9];
	public static String rowNine[]= new String [9];
	
	public static String [] allArrays [] = {rowOne, rowTwo, rowThree, rowFour, rowFive, rowSix, rowSeven, rowEight, rowNine};
	
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
		//char[] chars = new char[81];
		//chars = candidateSolution.toCharArray();
		
		System.out.println(candidateSolution);
		
		String setti="";
		
		StringBuilder b = new StringBuilder();
		
		String[] chars = new String[81];
		chars = candidateSolution.split("");
		int z = 0;
		
		for(int i=0; i<9; i++)
		{
			for(int y=0; y<9; y++)
			{	
				allArrays[i][y] = chars[z];
				z++;
				//System.out.println(allArrays[i][y]);
				
			}
			
		}
		
		for (int i = 0; i < 9; i++) 
		{
			for(int y = 0; y<9; y++)
			{
			   b.append( allArrays[i][y]);
			}
		}
		
		setti = b.toString();
		return setti;
		
	}
	
	
	public static int checkHorizontal()
	{
		String subString;
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < 9; i++) 
		{
			for(int y = 0; y<9; y++)
			{
			   b.append( allArrays[i][y]);
			}
			
			subString = b.toString();

			
			if(uniqueString(subString))
			{
				return 1;
			} 
		}
		
	

		return 0;
		

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
