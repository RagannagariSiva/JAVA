package Working_with_Numbers;

public class Nth_pascals_triangle
{
	static void generateNthrow(int N) {
		int prev=1;
		System.out.print(prev);
		for(int i=1;i<=N;i++)
		{
			int curr=(prev*(N-i+1))/i;
			System.out.println(","+curr);
			prev=curr;
		}
	}
	public static void main(String[] args) {
		int N=5;
		generateNthrow(N);
	}
}
