package OperationStrings;

import java.util.Scanner;

public class CountCommonSubsequanceTwoStrings 
{
	static int CommonCount(String s,String t)
	{
		int n1=s.length();
		int n2=t.length();
		int dp[][]=new int[n1+1][n2+1];
		for (int i = 1; i <= n1; i++)
		{ 
			for (int j = 1; j <= n2; j++) 
			{ 
				char ch1 = s.charAt(i - 1); 
				char ch2 = t.charAt(j - 1); 
				if (ch1 == ch2)
				{ 
					dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j]; 
					}
				else { 
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1];
					}
				}
			}
		return dp[n1][n2];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String s=sc.nextLine();
		System.out.println("Enter the Second String: ");
		String t=sc.nextLine();
		sc.close();
		System.out.println("Common sub sequance: "+ CommonCount(s,t));
	}

}
