package Important;

import java.util.Stack;

public class PostfixEvaluation {

	static int evaluatePostfix(String exp)
	{
		//create a stack 
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) // traversing the expression

		{
			char c=exp.charAt(i); // storing each character in c

			if(Character.isDigit(c)) // checking for digits
				stack.push(c - '0'); // c - '0' is for removing ASCII values
			else
			{
				int val1=stack.pop();
				int val2=stack.pop();

				switch(c)
				{
				case '+':
					stack.push(val1+val2);
					break;

				case '-':
					stack.push(val1-val2);
					break;

				case '*':
					stack.push(val1*val2);
					break;

				case '/':
					stack.push(val1/val2);

				}
			}
		}
		return stack.pop();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="231*+9-"; 
		System.out.println("postfix evaluation: "+evaluatePostfix(exp)); 
	}

	/**** multiple digit numbers***/



}
