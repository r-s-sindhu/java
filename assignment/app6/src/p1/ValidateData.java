package p1;

public class ValidateData 
{
	public void stdDetails(int id,String name,String clg,int rol,int score,String city)
	{
		if(score>=60 && score<70)
		{
			System.out.println("VIT");
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("College : "+clg);
			System.out.println("Roll no : "+rol);
			System.out.println("Score : "+score);
			System.out.println("City : "+city);
		}
		else if(score>=70 && score<80)
		{
			System.out.println("BIT");
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("College : "+clg);
			System.out.println("Roll no : "+rol);
			System.out.println("Score : "+score);
			System.out.println("City : "+city);
		}
		else if(score>=80 && score<90)
		{
			System.out.println("NIT");
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("College : "+clg);
			System.out.println("Roll no : "+rol);
			System.out.println("Score : "+score);
			System.out.println("City : "+city);
		}
		else if(score>=90)
		{
			System.out.println("IIT");
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("College : "+clg);
			System.out.println("Roll no : "+rol);
			System.out.println("Score : "+score);
			System.out.println("City : "+city);
		}
		else
		{
			System.out.println("Not applicable");
		}
	}
}
