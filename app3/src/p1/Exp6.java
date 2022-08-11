package p1;

import java.util.Scanner;

public class Exp6 {
	int id;
	String name;
	public Exp6(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter name : ");
		String name=sc.next();
		Exp6 obj=new Exp6(id,name);
		//System.out.println(obj.id);
		//System.out.println(obj.name);
	}
}

