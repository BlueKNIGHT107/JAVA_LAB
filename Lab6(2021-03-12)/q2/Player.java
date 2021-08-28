package q2;
public class Player implements Cricket_Player, Football_Player, Hockey_Player 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from the Player class.");
		print_players();
	}
	
	public static void print_players()
	{
		Player obj = new Player();
		obj.print_cricket_player();
		obj.print_football_player();
		obj.print_hockey_player();
	}

	
	@Override
	public void print_cricket_player() 
	{
		System.out.println("Hello from the Cricket_Player.");	
	}

	@Override
	public void print_football_player() 
	{
		System.out.println("Hello from the Football_Player.");
	}
	
	@Override
	public void print_hockey_player() 
	{
		System.out.println("Hello from the Hockey_Player.");
	}

}
