package p2;
import java.util.Scanner;

import p1.ValidateData;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter roll no : ");
		int rol=sc.nextInt();
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter college name : ");
		String clg=sc.next();
		System.out.println("Enter score : ");
		int score=sc.nextInt();
		System.out.println("Enter city : ");
		String city=sc.next();
		
		ValidateData obj=new ValidateData();
		obj.stdDetails(id, name, clg, rol, score, city);
	}
}

