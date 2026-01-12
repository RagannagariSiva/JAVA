package Working_with_Numbers;

public class Nonzero_digit_factorial
{
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) 
	{
		int num=5;
		int fact=factorial(num);
		int res;
		while(fact%10==0) {
			fact /=10;
		}
		System.out.print("Last non-zero digit in factorials: "+fact%10);
	}

}
