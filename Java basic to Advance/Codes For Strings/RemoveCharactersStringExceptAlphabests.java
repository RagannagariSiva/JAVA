package OperationStrings;

import java.util.Scanner;

public class RemoveCharactersStringExceptAlphabests {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Words,Numbers & Symbols : ");
		String s=sc.nextLine();
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
	}

}
