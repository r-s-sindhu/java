package com.test;

import java.util.Scanner;

public class Exp4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		System.out.println("Enter the company :");
		String company=sc.next();
		System.out.println("Enter the city :");
		String city=sc.next();
		System.out.println("Enter the mobile no. :");
		long mobile=sc.nextLong();
		System.out.println("--------------------------");
		System.out.println("Name :"+name);
		System.out.println("Company :"+company);
		System.out.println("City :"+city);
		System.out.println("Mobile :"+mobile);
		//System.out.println("Name :"+name+" Company :"+company+" City :"+city+" Mobile :"+mobile);
	}
}
