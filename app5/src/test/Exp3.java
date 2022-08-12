package test;

import java.util.Scanner;

public class Exp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression : ");
		String exp = sc.next();
		int b1=0,b2=0,b3=0;	
		int flag = 0;
		for(int i = 0 ; i < exp.length();i++)
		{
			char ch = exp.charAt(i);		
			if(ch == '(')
				b1++;
			else if(ch == ')')
				b1--;
			else if(ch == '{')
				b2++;
			else if(ch == '}')
				b2--;
			else if(ch == '[')
				b3++;
			else if(ch == ']')
				b3--;
			//checking if at any point closing braces are more than opening braces
			if(b1 < 0 || b2 < 0 || b3 < 0)
			{
				flag = 1 ;
				break;
			}
		}		
		//values will be zero only if all braces are matching
		if(flag == 0 && b1 == 0 && b2 == 0 && b3 == 0)
			System.out.println("Matching Paranthesis");
		else
			System.out.println("Not Matching Paranthesis");		
	}
}

