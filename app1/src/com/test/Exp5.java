package com.test;

import java.util.Scanner;

public class Exp5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select 1 for Kannada, 2 for Hindi, 3 for English");
		int x=sc.nextInt();
		switch(x)
		{
		case 1: System.out.println("Kannada");
		break;
		case 2: System.out.println("Hindi");
		break;
		case 3: System.out.println("English");
		break;
		default: System.out.println("Select one option!!");
		}
	}
}
