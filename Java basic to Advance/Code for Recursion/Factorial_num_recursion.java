package Working_with_Numbers;

public class Factorial_num_recursion
{
	static int factorial(int n) {
		if(n==0)
			return 1;
		return n* factorial(n-1);
	}

	public static void main(String[] args)
	{
		int num=7;
		System.out.println("Factorial of "+num+ "is: "+factorial(num));
	}

}
