import java.util.Scanner;

public class NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("how many times?");
		int k = sc.nextInt();
		int result =0;
		for(int i=3;i<=k+2;i++)
		{
			int c = a+b;
			if(i<k+2)
			{
				a=b;
				b=c;
				
				continue;
			}
			else
			{
				result =c;
				break;
			}
		}
		System.out.println(result);

	}

}
