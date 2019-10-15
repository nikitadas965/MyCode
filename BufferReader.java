package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an int");
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
		System.out.println("enter a string");
		String str=br.readLine();
		System.out.println(str);
		
	}

}
