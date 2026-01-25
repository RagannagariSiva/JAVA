package OperationStrings;

import java.util.Scanner;

public class RemoveBracketsFromAlgebraicExpression {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Words with brackes: ");
		String s=sc.nextLine();
		String result=s.replaceAll("[()\\[\\]{}]","");
		System.out.println("Expression without brackets: "+result);
	}
}