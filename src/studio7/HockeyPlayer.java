package studio7;

public class HockeyPlayer {
	//instant variables 
	private String name;
	private int jerseyNumber;
	private int goals;
	private int assists;
	private int games;
	private int points;
	
	public HockeyPlayer(String name, int goals, int assists, int games) {
		this.name = name;
		this.goals = goals;
		this.assists = assists;
		this.games = games;
		this.points = goals + assists;
	}

	public String toString() {
		return "Player name: " + name + ", Goals: " + goals + ", Assists: " + assists + ", Games: " + games + ", Total points: " + points;
	}
	
	public static void main(String[] args) {
		HockeyPlayer player = new HockeyPlayer("Mariana", 10, 2, 100);
		System.out.print(player.toString());
	}
	
	
	
	
	
}
