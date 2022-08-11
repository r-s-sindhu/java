//Method Chaining
package p1;
class MethodChn
{
	public void method1()
	{
		System.out.println("Method 1");
		method2();
	}
	public void method2()
	{
		System.out.println("Method 2");
		method3();
	}
	public void method3()
	{
		System.out.println("Method 3");
		methodn();
	}
	public void methodn()
	{
		System.out.println("Method n");
	}
}
public class Exp2 {
	public static void main(String[] args)
	{
		MethodChn obj=new MethodChn();
		obj.method1();
	}
}
