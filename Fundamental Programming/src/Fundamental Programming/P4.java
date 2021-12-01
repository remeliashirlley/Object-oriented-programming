package lab1;

import java.util.*;

public class P4 {
	public static void main(String[] args) {
		Scanner userinput= new Scanner (System.in);
		int height;
		System.out.println("Enter height:");
		height=userinput.nextInt();
		if (height==0 || height<0)
			System.out.println("Error input!!");
		else {
			for (int i=1;i<height+1;i++)
			{	
				if (i==1)
					System.out.println("AA");
				else if (i!=1 && i%2==1)
				{
					for (int x=0;x<((i-1)/2);x++)
					{
						System.out.print("AABB");
					}
					System.out.println("AA");
				}
				else {
					for (int x=0;x<((i-1)/2)+1;x++)
						System.out.print("BBAA");
					System.out.println();
				}	
			}
		}
	}
}

