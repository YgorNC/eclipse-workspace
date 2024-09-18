package entities;

public class Calc {
	
	public double width;
	public double height;
	
	public double calcArea() {
		return width * height;
	}
	
	public double calcPerimeter() {
		return 2 * (width + height);
	}
	
	public double calcDiagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
