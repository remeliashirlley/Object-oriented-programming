package lab4;

public abstract class Shape {

	private String shapeType;
	
	public String getShapeType()
	{
		return shapeType;
	}
	
	public void setShapeType(String type)
	{
		this.shapeType = type;
	}
	
	public abstract double Area();
}
