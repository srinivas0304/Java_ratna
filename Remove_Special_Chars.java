package ratna;

import java.util.Scanner;

public class Remove_Special_Chars 
{
	public static void main(String[] args)
	{
		
		String result="";
		System.out.println("Enter String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String removeChars="[a-zA-Z0-9\\s+]";
		
		  for(int i=0;i<s.length();i++) 
		  { 
			  char ch=s.charAt(i);
		  
		  if(String.valueOf(ch).matches(removeChars))
		  	 { 
			  result=result+ch; 
			  }
		  }
		 
		
		System.out.println(result);
		
	}
}
