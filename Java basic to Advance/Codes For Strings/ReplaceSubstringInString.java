package OperationStrings;

import java.util.Scanner;

public class ReplaceSubstringInString
{
	public static String replaceSubstring(String original, String toReplace, String replacement)
	{
		 if (!original.contains(toReplace)) {
	            return original;
		 }
		 String modified = original.replaceAll(toReplace, replacement);
		 return modified;
	}
	public static void main(String[]args) {
		String originalString = "Hello, World!";
        String substringToReplace = "World";
        String replacement = "Java";
        String modifiedString = replaceSubstring(originalString, substringToReplace, replacement);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
	}
}