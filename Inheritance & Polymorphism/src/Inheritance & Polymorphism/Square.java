package lab4;

public class Square extends Rectangle {

	public Square(double len)
	{
		super(len, len);
	}
	
	public Square(int num, double len)
	{
		super(len, len);
		setShapeType("Square" + num);
	}
	
	public double Area()
	{
		return super.Area();
	}
	
}
