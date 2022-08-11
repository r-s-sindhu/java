package p1;

class SingleTn
{
	static SingleTn obj=null;
	private SingleTn()
	{
		
	}
	
	public static SingleTn getObj()
	{
		if(obj==null)
		{
			obj=new SingleTn();
		}
		return obj;
	}
}
public class Exp8 {
	public static void main(String[] args)
	{
		SingleTn obj1=SingleTn.getObj();
		SingleTn obj2=SingleTn.getObj();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
