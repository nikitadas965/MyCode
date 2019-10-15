import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.contains("a"))
			{
				
			}
		}
		
		
	}
*/
		
		 Scanner in = new Scanner(System.in);
	        int charCount = in.nextInt();
	        for (int i = 0; i < charCount; i++) {
	            int charCode = in.nextInt();
	           
	            char ch = (char) charCode;
	            System.out.print(ch);
	           /* String str = String.valueOf(charCode);
	            System.out.println(str.toString());*/
	        }

}
}
