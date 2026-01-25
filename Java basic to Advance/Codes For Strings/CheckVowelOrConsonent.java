package OperationStrings;

import java.util.Scanner;

public class CheckVowelOrConsonent{

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter an alphabet: "); 
    	char ch = sc.next().charAt(0); 
    	ch = Character.toUpperCase(ch); 
    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
    	{ System.out.println(ch + " is a Vowel");
    	} 
    	else { 
    		System.out.println(ch + " is a Consonant");
    		}
    	sc.close(); 
    	}
    }