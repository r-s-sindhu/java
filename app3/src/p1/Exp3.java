package p1;

class Employee
{
	//default constructor
	public Employee()
	{
		System.out.println("Default");
	}
	
	//parameterized constructor
	public Employee(int x, String y)
	{
		System.out.println("Parameterized");
	}
	
	//overloaded constructor
	public Employee(double x, char y)
	{
		System.out.println("Overloaded");
	}
	
	//object parameterised constructor
	public Employee(Employee obj)
	{
		System.out.println("Object Parameterized");
	}
}
public class Exp3 {
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		Employee obj1=new Employee(1,"abc");
		Employee obj2=new Employee(10.22,'a');
		Employee obj3=new Employee(obj);
	}
}
