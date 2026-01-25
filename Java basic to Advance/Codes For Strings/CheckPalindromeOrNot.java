package OperationStrings;

import java.util.Scanner;

public class CheckPalindromeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word for Palindrome: ");
		String n=sc.nextLine();
		String rev="";
		for(int i=n.length()-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
		if(n.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
