package Working_with_Numbers;

public class Reversing_num
{
	static int reverseDigits(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num /=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num=1234521;
		System.out.println("Reverse of no is: "+reverseDigits(num));
	}

}
