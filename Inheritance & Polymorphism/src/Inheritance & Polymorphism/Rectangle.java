package lab4;

public class Rectangle extends Shape {

	private double length, breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(int num, double length, double breadth)
	{
		setShapeType("Rectangle" + num);
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getBreadth()
	{
		return this.breadth;
	}
	
	public double Area()
	{
		return this.length * this.breadth;
	}
	
}
