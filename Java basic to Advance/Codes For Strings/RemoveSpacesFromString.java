package OperationStrings;

import java.util.Scanner;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Words: ");
		String n=sc.nextLine();
		char[] c=n.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n.length();i++) {
			if((c[i]!=' ')&&(c[i]!='\t')) {
				sb.append(c[i]);
			}
		}
		System.out.println("String after removing Spaces: "+sb);
	}

}
