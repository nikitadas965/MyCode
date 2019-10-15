import java.util.ArrayList;
import java.util.Scanner;


 public class PrintInitials { 
public static void main(String[] args) 
    { 
	  Scanner in = new Scanner(System.in);
      String s = in.next();
      int counta=0; int countc=0;int countg=0;int countt=0;
      String str[]=s.split("");
      for(int i=0;i<str.length;i++)
      {
         if(str[i].equalsIgnoreCase("A"))
         {
        	 counta++;
         }
         if(str[i].equalsIgnoreCase("C"))
         {
        	 countc++;
         }
         if(str[i].equalsIgnoreCase("G"))
         {
        	 countg++;
         }
         if(str[i].equalsIgnoreCase("T"))
         {
        	 countt++;
         }
          
      }
      System.out.println(counta+" "+countc+" "+countg+" "+countt);
    } 
}
