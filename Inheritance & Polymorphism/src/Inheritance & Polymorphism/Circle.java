package lab4;

public class Circle extends Shape {

	private double radius;
	protected final float PI = 3.142f;
	
	public Circle(double rad)
	{
		this.radius = rad;
	}
	
	public Circle(int number, double radius)
	{
		setShapeType("Cirle" + number);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double Area()
	{
		return this.PI * Math.pow(this.radius, 2.0);
	}
	
}
