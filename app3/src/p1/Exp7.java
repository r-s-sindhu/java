package p1;

import java.util.Scanner;

class Customer
{
	public int id;
	public String name;
	public String city;
	
	public Customer(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public void disp()
	{
		System.out.println("ID : "+id+" Name : "+name+" City : "+city);
	}
}
public class Exp7 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		String city=sc.next();
		Customer obj=new Customer(id,name,city);
		obj.disp();
	}
}

