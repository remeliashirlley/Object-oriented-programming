package lab1;

import java.util.*;

public class P3 {
	
	public static void main(String[] args) {
		int start;
		int end;
		int increment;
		Scanner userinput=new Scanner(System.in);
		
		System.out.println("Enter starting:");
		start=userinput.nextInt();
		System.out.println("Enter ending:");
		end=userinput.nextInt();
		System.out.println("Enter increment:");
		increment=userinput.nextInt();
		
		if ((start>end)||increment==0)
			System.out.println("Error!");
		else {
			System.out.println("US$ \t\t S$");
			System.out.println("-------------------");
			for (int i=start;i<end+1;i+=increment) {
				System.out.printf(i + " \t\t %.2f" , 1.82*i);
				System.out.println();
			}
			
			System.out.println();
			System.out.println("US$ \t\t S$");
			System.out.println("-------------------");
			int i= start;
			while (i<end+1)
			{
				System.out.printf(i + " \t\t %.2f" , 1.82*i);
				System.out.println();
				i+=increment;
			}
			
			System.out.println();
			System.out.println("US$ \t\t S$");
			System.out.println("-------------------");
			i=start;
			do {
				System.out.printf(i + " \t\t %.2f" , 1.82*i);
				System.out.println();
				i+=increment;
			}
			while (i<end+1);
		}
	}
}
