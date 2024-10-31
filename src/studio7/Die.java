package studio7;

public class Die {
	//instant variables
	private int side;
	
	//constructors 
	public Die(int n) {
		side = n;
		this.side = n;
	}
	public int random () {
		return ((int)(Math.random()* this.side)) +1;
	}

//	public String toString() {
//		String result = "Side: " + this.side;
//		return result;
//	}
	public static void main(String[]args) {
		Die die = new Die(6);
		System.out.print(die.random());
	}
}
