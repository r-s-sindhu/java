//Constructor chaining
package p1;
class Book
{
	public Book()
	{
		this("Java");
		System.out.println("Constructor");
	}
	public Book(String x)
	{
		this(10);
		System.out.println("Single args");
	}
	public Book(int x)
	{
		System.out.println("int args");
	}
}
public class Exp5 {
	public static void main(String[] args)
	{
		Book obj=new Book();
	}
}
