package test;

import java.util.Scanner;

public class Exp2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		int flag=0;
		for(int i=0;i<n-1;i++)
		{
			int needed=target-arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==needed)
				{
					flag=1;
					System.out.println("Sum found by adding values "+arr[i]+" and "+arr[j]);
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
	}
}