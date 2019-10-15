import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int high=0;
	        int low=0; //5
	    
	        int mario = in.nextInt(); // mario ht
	        for (int i = 0; i < mario; i++) {
	            int pillar = in.nextInt();   // hts  //   4 7 2 3 7 : o/p 3 1
	            
	            if(mario < pillar)
	            {
	            	high++;//1
	            }
	            else if(mario >= pillar)
	            {
	            	low++;//1
	            }
	        }
	        System.out.println(low +" "+ high);
	       
	        
	        /*When Mario jumps from a lower pillar to a higher pillar, 
	         * he has to use High Jump. 
	         * When he jumps to a pillar of lower or same height, he has to use Low Jump.*/
	}

}
