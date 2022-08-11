package p1;

class Student
{
	public Student()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("Static block1");
	}
	{
		System.out.println("Instance block");
	}
	//factory method
	public Student getObj()
	{
		return new Student();
	}
}
public class Exp4 {
	static
	{
		System.out.println("Static block");
	}
	public static void main(String[] args)
	{
		System.out.println("Main method");
		Student obj=new Student();
		System.out.println(" ");
		Student obj1=new Student();
		System.out.println(" ");
		//factory method
		obj1.getObj();
	}
}
