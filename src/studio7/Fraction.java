package studio7;

public class Fraction {
	//instant variables 
	private double numerator; 
	private double denominator;
	private double sum;
	private double product;
	private double reciprocal;


	//constructors
	public Fraction(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.sum = (numerator/denominator) + 2/1;
		this.product = (numerator/denominator) * 2/1;
		this.reciprocal = (denominator/numerator);
	}
	public String toString() {
		return "Sum: " + sum + " Product: " + product + " Reciprocal: " + reciprocal;
	}
	
	public static void main(String[]args) {
		Fraction fraction = new Fraction(5, 2);
		System.out.print(fraction.toString());
	}
	
	
}


