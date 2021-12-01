package lab4;

public class Pyramid extends Triangle {

	private Square s1;
	
	public Pyramid(double base, double height)
	{
		super(base, height);
		s1 = new Square(base);
	}
	
	public Pyramid(int number, double base, double height)
	{
		super(base, height);
		setShapeType("Pyramid" + number);
	}
	
	public double Area()
	{
		return Math.pow(getBase(), 2) + (Math.sqrt(getHeight()*getHeight() + Math.pow((0.5 * getBase()), 2))) * getBase()*0.5*4;
	}
	
	public double Volume()
	{
		return (super.getBase() * super.getBase() * super.getHeight())/3;
	}
}
