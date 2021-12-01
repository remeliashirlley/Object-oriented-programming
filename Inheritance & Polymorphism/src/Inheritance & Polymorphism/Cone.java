package lab4;

public class Cone extends Shape{

	private double radius;
	private double height;
	protected float PI = 3.142f;
	
	public Cone(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public Cone(int number, double radius, double height)
	{
		setShapeType("Cone" + number);
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double Area()
	{
		return PI * this.radius * (this.radius + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2)));
	}
	
	public double Volume()
	{
		return PI * Math.pow(this.radius, 2) * (this.height/3);
	}
}
