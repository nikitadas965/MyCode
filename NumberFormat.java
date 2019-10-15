/*import java.util.*;
	import java.text.*;

public class NumberFormat {
	
takes an amount from user and prints it in respective country s currency format	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        NumberFormat formatter1= NumberFormat.getCurrencyInstance(Locale.US);
	        String us= formatter1.format(payment);

	        NumberFormat formatter2=NumberFormat.getCurrencyInstance(Locale.CHINA);
	        String china= formatter2.format(payment);

	        NumberFormat formatter3= NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        String france = formatter3.format(payment);

	        NumberFormat  formatter4=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
	        String india= formatter4.format(payment); // india s currency is not in-built, creating a new currency using en as language

	       
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}



}
*/