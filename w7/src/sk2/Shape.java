package sk2;

abstract public class Shape {
    private String shapeName;
    
    public Shape(String shapeName) {
    	this.shapeName = shapeName;
    }
    
    public abstract double area();
    public  String toString(){
        String result = "Shape Name : "+ shapeName;
        return result;
    }
}