package OperationStrings;

import java.util.Scanner;

public class CapitalizeFirstLastLetterWordString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String newstr="";
		String[]str=s.split("\\s");
		for(String string:str) {
			int length=string.length();
			String firstchar=string.substring(0,1);
			String restchar=string.substring(1,length-1);
			String lastchar=Character.toString(string.charAt(length-1));
			newstr=newstr+firstchar.toUpperCase()+restchar+" ";
		}
		System.out.println(newstr);
		
	}

}
