import java.util.Scanner;

/*Your program must destroy the enemy ships by shooting the closest enemy on each turn.
 	Rules
On each start of turn (within the game loop), you obtain information on the two closest enemies:
enemy1 and dist1: the name and the distance to enemy 1.
enemy2 and dist2: the name and the distance to enemy 2.
Before your turn is over (end of the loop), output the value of either enemy1 or enemy2 to shoot the closest enemy.**/
public class EnemyBattleShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc= new Scanner(System.in);
		
		//game loop
		while(true)
		{
			String enemy1= sc.next(); // enemy 1 s name and distance
			int dist1=sc.nextInt();
			String enemy2 = sc.next();
			int dist2= sc.nextInt();
			
			*//****the condition to kill the enemy ship***//*
			if (dist1 < dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }
			
		}*/
		 Scanner in = new Scanner(System.in);
	        int A = in.nextInt();
	        int B = in.nextInt();
	        
	        int answer =Integer.valueOf(String.valueOf(A-B) + String.valueOf(A+B));
	       // System.err.println(answer);

	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println(answer);
		

	}

}
