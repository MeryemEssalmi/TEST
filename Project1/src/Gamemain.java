import java.util.*;  
public class Gamemain {
static void generate_fantome(Fantome monster) {
	int time =0;
	if (monster.ptvie==0) {
		time=time+1;
		if (time==3) {
			monster.ptvie=3;
			monster.x=(int)(Math.random());
			monster.y=(int)(Math.random());
		}
	}
}
static void start_game(Heros player,Fantome monster) {
	//Defining the starting value test to true 
	boolean test=true;
	//Verify if we continue to play 
	while( test) {
	if (player.ptvie==0) {
		test=false;
		System.out.println("Game Over");
		System.out.println("start the Game!");
	}
	//Demand to players to enter the option 
	System.out.println("Choose your option!");
	Scanner scan =new Scanner(System.in);
	String direction= scan.nextLine();
	String value=direction;
	if (direction.equals("A")) {
		monster.attack();
	}
	if (direction.equals("P")) {
		boolean pause=true;
		while (pause) {
		System.out.println("You paused the Game! to resume the game press C");
		Scanner scan1 =new Scanner(System.in);
		String commande= scan1.nextLine();
		if(commande.equals("C")) {
			pause=false;
		}
		}	
	}
	if (direction.equals("S")) {
		//on doit ajouter une fen�tre pour demander s'il est sure sur l'interface graphique
		test=false;
		System.out.println("You exited the Game!");
		System.out.println("Restart the Game!");
		
	}
	player.move(direction);
	System.out.println("player("+player.x+","+player.y+")");
	if (player.ptvie==0) {
		test=false;
		System.out.println("Game Over");
		System.out.println("Restart the Game!");
	}
	generate_fantome (monster);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x1= 0;
	    int y1= 0;
	    boolean test2=true;
		while (test2) {
		System.out.println("Press R if you want to restart the game");
		Scanner scan3 =new Scanner(System.in);
		String restart= scan3.nextLine();
		if (restart.equals("R")) {
		Heros player= new Heros(x1,y1);
		Fantome monster=new Fantome((int)(Math.random()),(int)(Math.random()));
		start_game(player,monster);
		}
		
		

	}
	}

}