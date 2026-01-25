package OperationStrings;

import java.util.Scanner;

public class CharacterAlphaberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch=sc.next().charAt(0);
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
			 System.out.println("The inserted character " + ch + " is an Alphabet");
		else
		      System.out.println("The inserted character " + ch + " is not an Alphabet");
	}

}
