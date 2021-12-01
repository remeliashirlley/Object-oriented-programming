package lab2;

import java.util.Scanner; 

public class Lab2p1 {
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in); 
		do {
			System.out.println("Perform the following methods:"); 
			System.out.println("1: multiplication test"); 
			System.out.println("2: quotient using division by subtraction"); 
			System.out.println("3: remainder using division by subtraction"); 
			System.out.println("4: count the number of digits"); 
			System.out.println("5: position of a digit"); 
			System.out.println("6: extract all odd digits"); 
			System.out.println("7: quit");
			choice = sc.nextInt();
			int m;
			int n;
			switch (choice) {
				case 1: /* add mulTest() call */
					mulTest();
					break;
				case 2: /* add divide() call */
					System.out.println("Enter dividend:");
					m = sc.nextInt();
					System.out.println("Enter divisor:");
					n = sc.nextInt();
					System.out.printf("%d/%d = %d\n",m,n,divide(m,n));
					break;
				case 3: /* add modulus() call */
					System.out.println("Enter dividend:");
					m = sc.nextInt();
					System.out.println("Enter divisor:");
					n = sc.nextInt();
					System.out.printf("%d %% %d = %d\n",m,n,modulus(m,n));
					break;
				case 4: /* add countDigits() call */
					System.out.println("Enter positive integer:");
					n = sc.nextInt();
					if (n<0)
						System.out.println("Error input!!!");
					else
						System.out.printf("count = %d\n",countDigits(n));
					break;
				case 5: /* add position() call */
					System.out.println("Enter positive integer:");
					m = sc.nextInt();
					System.out.println("Enter digit to find position:");
					n = sc.nextInt();
					System.out.printf("position = %d\n",position(m,n));
					break;
				case 6: /* add extractOddDigits() call */
					System.out.println("Enter positive integer:");
					n = sc.nextInt();
					if (n<0)
						System.out.println("Error input!!!");
					else
						System.out.printf("oddDigits = %d\n",extractOddDigits(n));
					break;
				case 7: System.out.println("Program terminating ....");
				}
			} while (choice < 7); 
	}
	/* add method code here */
	public static void mulTest() {
		Scanner userinput=new Scanner(System.in);
		int x=0;
		int y=0;
		int counter=0;
		
		for (int i=0;i<5;i++)
		{
			x= (int) (Math.random()*((9-1)+1));
			y= (int) (Math.random()*((9-1)+1));
			System.out.printf("How much is %d times %d?\n",x ,y);
			if (userinput.nextInt()==x*y)
				counter+=1;
		}
		System.out.printf("%d answers out of 5 are correct.\n",counter);
	}
	
	public static int divide(int m,int n) {
		int quotient=0;
		int remainder=m;
		while (n<=remainder) 
		{
			m-=n;
			remainder=m;
			quotient++;
		}
		return quotient;
	}
	
	public static int modulus(int m,int n) {
		int remainder=m;
		while (n<=remainder) 
		{
			m-=n;
			remainder=m;
		}
		return remainder;
	}
	
	public static int countDigits(int n) {
		int counter=0;
		while (n>0) 
		{
			n/=10;
			counter++;
		}
		return counter;
	}
	
	public static int position (int n, int digit) {
		int counter=0;
		int lPos=0;
		while (n>0) 
		{
			if (n%10==digit)
				lPos=counter;
			n/=10;
			counter++;
		}
		if (lPos!=0)
			return counter-lPos;
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		int place=1;
		int x=0;
		while (n>0) {
			if ((n%10)%2==1)
			{
				x+=place*(n%10);
				place*=10;
			}
			n/=10;
		}
		if (x!=0)
			return x;
		else 
			return -1;
	}
}	