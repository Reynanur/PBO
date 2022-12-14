package sk2;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double area() {
		return Math.PI*radius*radius*height;
	}
	
	@Override
	public String toString() {
		String result = super.toString() + " of radius: " + radius + " of height: " +height;
		return result;
	}
}