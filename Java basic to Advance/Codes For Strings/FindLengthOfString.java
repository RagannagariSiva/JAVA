package OperationStrings;

import java.util.Scanner;

public class FindLengthOfString {
/* Java Program to find length of the string without using length function */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value: ");
		String s=sc.nextLine();
		int length=0;
		for(char c1:s.toCharArray())
			length++;
		System.out.println("Length of String is  : "+length);
		}
}
