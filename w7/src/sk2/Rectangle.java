package sk2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length){
    	super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double area(){
        return length * width;
    }
    
    @Override
    public String toString() {
    	String result = super.toString() + " of length: " + length + "and width: " + width;
        return result;
    }
}
