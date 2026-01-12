package Working_with_Numbers;

public class Print_N_term_resurion 
{
	static int term (int calculated, int current, int N)
	  {
	    int i, result = 0;
	    while (current != N + 1)
	      {
	    int cur = 1;
	    for (i = calculated; i < calculated + current; i++)
	      cur *= i;
	    calculated = i;
	    result += cur;
	    current++;
	      }
	    return result;
	  }
	public static void main(String[] args) {
		int n=4;
		System.out.print("F(N)th printed value[ 1 + (2*3) + (4*5*6) + (7*8*9*10)] = "+term(1,1,n));
	}	
}