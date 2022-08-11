package p1;

public class Exp1 //implements cloneable
{
	int id=101;
	static int pin=100;
	public void disp()
	{
		System.out.println(id+" "+Exp1.pin);
	}
	
	
	
	//factory method
	public Exp1 getObj()
	{
		return new Exp1();
	}
	//or
	/*public Exp1 getObj(Exp1 obj)
	{
		return obj;
	}
	//or
	public Exp1 getObj1()
	{
		Exp1 obj1=new Exp1();
		return obj1;
	}*/
	
	
	
	public static void main(String[] args) throws Exception
	{
		Exp1 obj=new Exp1();
		obj.disp();
		Exp1 obj1=new Exp1();
		Exp1 obj2=obj1.getObj();
		obj2.disp();
		
		//clone method
		Exp1 obj3=(Exp1)obj.clone();
		
		
		
		//System.out.println(obj);//prints the hashcode of object System.out.println(obj.hashCode()), return type is int
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
