import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int length= str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=length-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
