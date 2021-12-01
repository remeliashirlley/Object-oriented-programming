package lab4;

public class Sphere extends Circle {
	
	public Sphere(double radius)
	{
		super(radius);
	}
	
	public Sphere(int number, double radius)
	{
		super(radius);
		setShapeType("Sphere" + number);
	}
	
	public double Area()
	{
		return 2 * super.Area();
	}
	
	public double Volume()
	{
		return (double)4/3 * PI * Math.pow(super.getRadius(), 3);
	}
}
