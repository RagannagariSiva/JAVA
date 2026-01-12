package Working_with_Numbers;

public class Smallest_Array
{
	public static int findMinimum(int A[],int n) {
		if(n==1)
			return A[0];
		return Math.min(A[n-1],findMinimum(A, n-1));
	}
	public static void main(String[] args) 
	{
		int A[]= {14,21,-98,0,43};
		int n=A.length;
		System.out.println("Smallest element in the array is: "+findMinimum(A,n));
	}
}