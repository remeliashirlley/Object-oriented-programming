package lab1;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		Scanner userinput=new Scanner (System.in);
		int salary;
		int merit;
		char grade='\0';
		System.out.println("Enter salary:");
		salary=userinput.nextInt();
		System.out.println("Enter merit points:");
		merit=userinput.nextInt();
		
		if (salary<900 && salary>799)
			grade='A';
		else if (salary>699 && salary<800) {
			if (merit<20)
				grade='B'; 
			else 
				grade='A';
		}
		else if (salary>599 && salary<650) {
			if (merit<10)
				grade='C';
			else
				grade='B';
		}
		else if (salary>499 && salary<650)
			grade='C';
		
		System.out.println("Grade " + grade);
	}
}

