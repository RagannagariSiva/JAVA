package OperationStrings;

import java.util.Scanner;

public class ClaculateASCIIValues 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet: ");
		char ch = sc.next().charAt(0); 
		int i=ch;
		System.out.println("ASCII value of "+ch+" is "+i);
	}

}
