package lab4;
import java.util.*;

public class Shape3DApp {

	public static void main(String[] args) {
		
		int numOfShapes;
		int choice=0;
		double length, breadth, height;
		int sphere=1, pyramid=1, cuboid=1, cone=1, cylinder=1;
		double totalArea=0, totalVolume=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total number of shapes:");
		numOfShapes=sc.nextInt();
		Shape[] shapeList = new Shape[numOfShapes];
		
		for(int i=0; i<numOfShapes; i++)
		{
			System.out.println("Choose the shape:");
			System.out.println("(1) Sphere");
			System.out.println("(2) Pyramid");
			System.out.println("(3) Cuboid");
			System.out.println("(4) Cone");
			System.out.println("(5) Cylinder");
			
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("Input the radius of the sphere:");
					shapeList[i] = new Sphere(sphere, sc.nextDouble());
					System.out.println("Sphere" + sphere + " has been created!");
					++sphere;
					break;
				
				case 2:
					System.out.println("Input the length of the pyramid:");
					length = sc.nextDouble();
					System.out.println("Input the height of the pyramid:");
					breadth = sc.nextDouble();
					shapeList[i] = new Pyramid(pyramid, length, breadth);
					System.out.println("Pyramid" + pyramid + " has been created!");
					++pyramid;
					break;
				
				case 3:
					System.out.println("Input the length of the cuboid:");
					length = sc.nextDouble();
					System.out.println("Input the breadth of the cuboid:");
					breadth = sc.nextDouble();
					System.out.println("Input the height of the cuboid:");
					height = sc.nextDouble();
					shapeList[i] = new Cuboid(cuboid, length, breadth, height);
					System.out.println("Cuboid" + cuboid + " has been created!");
					++cuboid;
					break;
				
				case 4:
					System.out.println("Input the radius of the cone:");
					length = sc.nextDouble();
					System.out.println("Input the height of the triangle:");
					height = sc.nextDouble();
					shapeList[i] = new Cone(cone, length, height);
					System.out.println("Cone" + cone + " has been created!");
					++cone;
					break;
					
				case 5:
					System.out.println("Input the radius of the cylinder:");
					length = sc.nextDouble();
					System.out.println("Input the height of the clinder:");
					height = sc.nextDouble();
					shapeList[i] = new Cylinder(cylinder, length, height);
					System.out.println("Cylinder" + cylinder + " has been created!");
					++cylinder;
					break;
			}
		}
		

		System.out.println("Choose the type of calculation:");
		System.out.println("(1) Print total surface area of 3D figure");
		System.out.println("(2) Print total volume of 3D figure");
		System.out.println("(3) Quit");
		do
		{
			choice = sc.nextInt();
			if (choice==1) 
			{
				for(int i=0;i<numOfShapes;i++)
				{
					if(shapeList[i] instanceof Sphere)
					{
						Sphere a1 = (Sphere)shapeList[i];
						//System.out.println(s1.Area());
						totalArea+= a1.Area();
					}
					else if(shapeList[i] instanceof Pyramid)
					{
						Pyramid b1 = (Pyramid)shapeList[i];	
						//System.out.println(b1.Area());
						totalArea+= b1.Area();
					}
					else if(shapeList[i] instanceof Cuboid)
					{
						Cuboid x1 = (Cuboid)shapeList[i];	
						totalArea+= x1.Area();
					}
					else if(shapeList[i] instanceof Cone)
					{
						Cone y1 = (Cone)shapeList[i];
						totalArea+= y1.Area();
					}
					else if(shapeList[i] instanceof Cylinder)
					{
						Cylinder z1 = (Cylinder)shapeList[i];
						totalArea+= z1.Area();
					}
				}
				System.out.printf("Total Surface Area of 3D figure: %.2f\n",totalArea);
			}
			else if (choice==2) 
			{
				for(int i=0;i<numOfShapes;i++)
				{
					if(shapeList[i] instanceof Sphere)
					{
						Sphere s1 = (Sphere)shapeList[i];	
						totalVolume+= s1.Volume();
					}
					else if(shapeList[i] instanceof Pyramid)
					{
						Pyramid p1 = (Pyramid)shapeList[i];	
						totalVolume+= p1.Volume();
					}
					else if(shapeList[i] instanceof Cuboid)
					{
						Cuboid c1 = (Cuboid)shapeList[i];	
						totalVolume+= c1.Volume();
					}
					else if(shapeList[i] instanceof Cone)
					{
						Cone t1 = (Cone)shapeList[i];
						totalVolume+= t1.Volume();
					}
					else if(shapeList[i] instanceof Cylinder)
					{
						Cylinder l1 = (Cylinder)shapeList[i];
						totalVolume+= l1.Volume();
					}
				}
				System.out.printf("Total Volume of 3D figure: %.2f\n",totalVolume);
			}
			else if (choice==3)
				break;
		} while(true);
	}
}
