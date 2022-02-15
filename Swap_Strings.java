package ratna;

import java.util.Scanner;

public class Swap_Strings 
{
	public static void main(String[] args)
	{
		String temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1");
		String s1=sc.next();
		
		System.out.println("Enter String s2");
		String s2=sc.next();
		    //temp=s1;
			//s1=s2;
			//s2=temp;
			s1=s1+s2;
			s2=s1.replace(s2, "");
			s1=s1.replace(s2, "");
			
		
		System.out.println(s1);
		
		System.out.println(s2);
	}
	
}
