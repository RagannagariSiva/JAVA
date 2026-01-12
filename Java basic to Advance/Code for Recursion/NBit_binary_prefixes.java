package Working_with_Numbers;

public class NBit_binary_prefixes
{
	static void printRec(String number,int extraOnces,int remainingPlaces)
	{
		if(0==remainingPlaces)
		{
			System.out.print(number+" ");
			return;
		}
		printRec(number+"1",extraOnces+1,remainingPlaces-1);
		if(0<extraOnces)
			printRec(number+"0",extraOnces-1,remainingPlaces-1);
		
	}
	static void printNums(int n)
	{
		String str="";
		printRec(str,0,n);
	}

	public static void main(String[] args) {
		int n=4;
		printNums(n);
	}

}
