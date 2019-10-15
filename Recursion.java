package misc;
//*****FACTORIAL****////
public class Recursion {
	
	static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
			
		return (n * factorial(n-1)) ;
		
	}
	
	/****Fibonacci*****/
	static int n1=0,n2=1,n3=0;      
    static void printFibo(int count){      
       if(count>0){      
            n3 = n1 + n2; // 1 2 3   
            n1 = n2;   // 1  1
            n2 = n3;  // 1 2  
            System.out.print(" "+n3);     
            printFibo(count-1); //14,   13,  
        }      
    }        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(factorial(5));

int count=15; 
System.out.print(" "+n3);    
System.out.print(n1+" "+n2);//printing 0 and 1      
printFibo(count-2);//n-2 because 2 numbers are already printed     
	}

}
