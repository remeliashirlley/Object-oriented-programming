package lab4;

public class Cuboid extends Rectangle {

	private double height;
	
	public Cuboid(double length, double breadth, double height)
	{
		super(length, breadth);
		this.height = height;
	}
	
	public Cuboid(int number, double length, double breadth, double height)
	{
		super(length, breadth);
		super.setShapeType("Cubiod" + number);
		this.height = height;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double Area()
	{
		return (super.Area() * 2) + (2 * super.getLength() * this.height) + (2 * super.getBreadth() * this.height);
	}
	
	public double Volume()
	{
		return super.Area() * this.height;
	}

}
