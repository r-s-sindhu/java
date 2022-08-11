package com.test;

import java.util.Scanner;

public class Exp6 {
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x, int y)
	{
		System.out.println(x-y);
	}
	public void mul(int x, int y)
	{
		System.out.println(x*y);
	}
	public void div(int x, int y)
	{
		System.out.println(x/y);
	}
	public static void main(String[] args)
	{
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("Select 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: ");
			int a=sc.nextInt();
			Exp6 obj=new Exp6();
			switch(a)
			{
			case 1: obj.add(x, y);
			break;
			case 2: obj.sub(x, y);
			break;
			case 3: obj.mul(x, y);
			break;
			case 4: obj.div(x, y);
			break;
			default: System.out.println("Choose one option!!");
			}
		}
	}
}
