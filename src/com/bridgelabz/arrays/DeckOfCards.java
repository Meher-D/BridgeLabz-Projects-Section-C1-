package com.bridgelabz.arrays;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] suits= { "clubes", "Diamonds", "Hearts", "Spades"};
		String[] ranks= {"2","3","4","5","6","7","8","9","jack","queen","king","ace"};
		int n=suits.length*ranks.length;
		String[] deck=new String[n];
		for(int i=0;i<ranks.length;i++)
		{
			for(int j=0;j<suits.length;j++)
			{
				deck[suits.length*i+j]=ranks[i]+  "  of  "   +suits[j];
			}
		}
		for(int i=0;i<n;i++)
		{
			int r= i+(int)(Math.random()*(n-i));
			String temp=deck[r];
			deck[r]=deck[i];
			deck[i]=temp;
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.println(deck[i]);
			}
		}
	}

}
