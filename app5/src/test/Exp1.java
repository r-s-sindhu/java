package test;

import java.util.Scanner;

class Exp1
{
	public static void rotate(int arr[], int d, int n)
	{
		int p=1;
		while(p<=d) {
			int last=arr[0];
			for(int i=0;i<n-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[n-1]=last;
			p++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7};
		int N=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times you want to rotate the array : ");
		int d=sc.nextInt();
		System.out.println("Array before rotation is : ");
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array after rotation is : ");
		rotate(arr,d,N);
	}
}

