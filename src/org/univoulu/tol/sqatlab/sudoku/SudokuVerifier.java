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
	
	
	public static String splitStringToArrays(String candidateSolution)
	{
		
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
		System.out.println("\n");
		
		String subString;
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < 9; i++) 
		{
			for(int y = 0; y<9; y++)
			{
			   b.append( allArrays[i][y]);
			}
			
			subString = b.toString();

			System.out.println(subString);
			
			if(!uniqueString(subString))
			{
				return 0;
			}
			
			b.setLength(0);
		}
		
		return 1;

	}
	
	
	public static int checkVertical()
	{
		String subString;
		StringBuilder b = new StringBuilder();
		
		
		
		for (int i = 0; i < 9; i++) 
		{
			for(int y = 0; y<9; y++)
			{
			   b.append( allArrays[y][i]);
			}
			
			subString = b.toString();

			//System.out.println(subString);
			
			if(!uniqueString(subString))
			{
				return 0;
			}
			
			b.setLength(0);
		}
		
		return 1;

	}
	
	
	public static int checkMiniGrids()
	{
		
		System.out.println("\n");
		String subString = null;
		StringBuilder b = new StringBuilder();
		

		int i = 0;
		int y = 0;
		
		int e = 3;
		int o = 3;
		

		
		for(int z = 0; z<3; z++)
		{
	
			for(i=e-3; i<e; i++)
			{
				for(y=0; y<3; y++)
				{
					b.append( allArrays[i][y]);
				}
			}
			
			e+=3;
			
			
			subString = b.toString();
			System.out.println(subString);
			
			if(!uniqueString(subString))
			{
				return 0;
			}
			
			b.setLength(0);
	
		}
		
		System.out.println(e);
		
		e=3;
		o=6;
		
		
		for(int z = 0; z<3; z++)
		{
	
			for(i=e-3; i<e; i++)
			{
				for(y=o-3; y<o; y++)
				{
					b.append( allArrays[i][y]);
				}
			}
			
			e+=3;
			
			subString = b.toString();
			System.out.println(subString);
			
			if(!uniqueString(subString))
			{
				return 0;
			}
			
			b.setLength(0);
	
		}
		
		System.out.println(e);
		
		e=3;
		o=9;
		
		
		for(int z = 0; z<3; z++)
		{
	
			for(i=e-3; i<e; i++)
			{
				for(y=o-3; y<o; y++)
				{
					b.append( allArrays[i][y]);
				}
			}
			
			e+=3;
			
			
			subString = b.toString();
			System.out.println(subString);
			
			if(!uniqueString(subString))
			{
				return 0;
			}
			
			b.setLength(0);
	
		}
		

		return 1;
	}
	
	
	public static boolean uniqueString(String candidateSolution)
	{
		
		
		HashSet <Character> uniquecharset= new HashSet();
        for(int i=0;i < candidateSolution.length();i++)
        {
            result=uniquecharset.add(candidateSolution.charAt(i));
            if (result == false)
            	break;
            
        }
        
        return result;
	}
	
	
	public static boolean isPositive(String candidateSolution)
	{
		
		int candidateNumber = Integer.parseInt(candidateSolution);
		
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
