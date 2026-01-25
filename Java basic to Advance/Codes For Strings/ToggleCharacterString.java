package OperationStrings;

import java.util.Scanner;

public class ToggleCharacterString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Valueof Name: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i)))
				s1=s1+Character.toLowerCase(s.charAt(i));
			else 
				s1=s1+Character.toUpperCase(s.charAt(i));
		}
		System.out.println("Toggle String is: "+s1);
	}

}
