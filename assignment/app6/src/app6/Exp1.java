package app6;

public class Exp1 {
	private int id=1;
	public String name="Sindhu";
	public String city="Bangalore";
	public double marks=78.33;
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
		System.out.println(marks);
	}
	public static void main(String[] args)
	{
		Exp1 obj=new Exp1();
		obj.show();
	}
}
