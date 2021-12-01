package lab4;
import java.util.*;

public class Shape2DApp {

	public static void main(String[] args) {
		
		int numOfShapes;
		int choice=0;
		double length, breadth;
		int square=1, rectangle=1, circle=1, triangle=1;
		double totalArea=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total number of shapes:");
		numOfShapes=sc.nextInt();
		Shape[] shapeList = new Shape[numOfShapes];
		
		for(int i=0; i<numOfShapes; i++)
		{
			System.out.println("Choose the shape:");
			System.out.println("(1) Square");
			System.out.println("(2) Rectangle");
			System.out.println("(3) Circle");
			System.out.println("(4) Triangle");
			
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("Input the length of the square:");
					shapeList[i] = new Square(square, sc.nextDouble());
					System.out.println("Square" + square + " has been created!");
					++square;
					break;
				
				case 2:
					System.out.println("Input the length of the rectangle:");
					length = sc.nextDouble();
					System.out.println("Input the breadth of the rectangle:");
					breadth = sc.nextDouble();
					shapeList[i] = new Rectangle(rectangle, length, breadth);
					System.out.println("Rectangle" + rectangle + " has been created!");
					++rectangle;
					break;
				
				case 3:
					System.out.println("Input the radius of the circle:");
					shapeList[i] = new Circle(circle, sc.nextDouble());
					System.out.println("Circle" + circle + " has been created!");
					++circle;
					break;
				
				case 4:
					System.out.println("Input the base of the triangle:");
					length = sc.nextDouble();
					System.out.println("Input the height of the triangle:");
					breadth = sc.nextDouble();
					shapeList[i] = new Triangle(triangle, length, breadth);
					System.out.println("Triangle" + triangle + " has been created!");
					++triangle;
					break;
			}
		}
		

		System.out.println("Choose the type of calculation:");
		System.out.println("(1) Print total area of 2D figure");
		System.out.println("(2) Quit");
		
		choice = sc.nextInt();
		if (choice==1) 
		{
			for(int i=0;i<numOfShapes;i++)
			{
				if(shapeList[i] instanceof Square)
				{
					Square s1 = (Square)shapeList[i];	
					totalArea+= s1.Area();
				}
				else if(shapeList[i] instanceof Rectangle)
				{
					Rectangle r1 = (Rectangle)shapeList[i];	
					totalArea+= r1.Area();
				}
				else if(shapeList[i] instanceof Circle)
				{
					Circle c1 = (Circle)shapeList[i];	
					totalArea+= c1.Area();
				}
				else if(shapeList[i] instanceof Triangle)
				{
					Triangle t1 = (Triangle)shapeList[i];
					totalArea+= t1.Area();
				}
			}
			System.out.printf("Total Area of 2D figure: %.2f\n",totalArea);
		}
	}
}
