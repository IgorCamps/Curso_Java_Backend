package entities;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double Area() {
		return Width * Height;
	}
	
	public double Perimeter() {
		return 2 * (Width + Height);
	}
	
	public double Diagonal() {
		return Math.sqrt((Width * Width) + (Height * Height));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f\n", Area())
		+ "PERIMETER = " + String.format("%.2f\n", Perimeter())
		+ "DIAGONAL = " + String.format("%.2f", Diagonal());
	}
}
