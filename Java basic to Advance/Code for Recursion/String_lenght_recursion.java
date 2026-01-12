package Working_with_Numbers;

public class String_lenght_recursion
{

	public static void main(String[] args) {
		int i=0;
		String str="Hello Ragannagari.!";
		char ch[]=str.toCharArray();
		for(char c: ch) {
			i++;
		}
		System.out.print("Lenght of the String= "+i);
	}

}
