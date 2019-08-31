package com.bridgelabz.arrays;

public class DeterminantMatrix
{
 public static void main(String[] args)
 {
		int[][] M = { 
				{ 1, 2, 3 }, 
				{ 0, 1, 4 }, 
				{ 5, 6, 0 } 
				};
		int[][] N1 = new int[2][2];

		N1[0][0] = M[1][1];
		N1[0][1] = M[1][2];
		N1[1][0] = M[2][1];
		N1[1][1] = M[2][2];
		for (int i = 0; i < N1.length; i++) 
		{
			for (int j = 0; j < N1[i].length; j++)
			{
				System.out.print(N1[i][j]+ " ");
			}
			System.out.println();
		}
		int detOfN1 = N1[0][0] * N1[1][1] - N1[1][0] * N1[0][1];
		System.out.println();
		N1[0][0] = M[1][0];
		N1[0][1] = M[1][2];
		N1[1][0] = M[2][0];
		N1[1][1] = M[2][2];
		
		for (int i = 0; i < N1.length; i++)
		{
			for (int j = 0; j < N1[i].length; j++) 
			{
				System.out.print(N1[i][j]+ " ");
			}
			System.out.println();
		}
		int detOfN2 = N1[0][0] * N1[1][1] - N1[1][0] * N1[0][1];
		System.out.println();
		N1[0][0] = M[1][0];
		N1[0][1] = M[1][1];
		N1[1][0] = M[2][0];
		N1[1][1] = M[2][1];
		
		for (int i = 0; i < N1.length; i++)
		{
			for (int j = 0; j < N1[i].length; j++) 
			{
				System.out.print(N1[i][j]+ " ");
			}
			System.out.println();
		}
		int detOfN3 = N1[0][0] * N1[1][1] - N1[1][0] * N1[0][1];
		System.out.println(); 
		
		int detOfM=1*(detOfN1)-2*(detOfN2)+3*(detOfN3);
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++)
			{
				System.out.print(M[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Determinant of M is:- "+detOfM);

	}                                                                                                                                             
 
 

}

