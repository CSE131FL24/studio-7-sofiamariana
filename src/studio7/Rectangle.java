package studio7;

public class Rectangle {
	//instant variables
	private double length;
	private double width;
	
	//constructors 
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return(this.length*this.width);	
	}
	public double perimeter() {
		return((2*this.length))+(2*(this.width));
	}
	public String toString() {
		String result = "Length: " + length + ", ";
		String result2 = "Width: " + width + ", ";
		String result3 = "Area: " + area() + ", ";;
		String result4 = "Perimeter: " + perimeter();
		return (result + result2 + result3 + result4);
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle (5,3);
		System.out.println(rect.toString());
	}
}
