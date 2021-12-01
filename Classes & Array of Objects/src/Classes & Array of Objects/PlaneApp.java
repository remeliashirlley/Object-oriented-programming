package lab3;

import java.util.*;

public class PlaneApp {
	
	public static void main(String[] args) {
		int choice;
		int seatId;
		int customerId;
		Scanner userinput = new Scanner(System.in);
		Plane planeX = new Plane();
		
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		
		do //execute at least once
		{
			System.out.print("\n    Enter the number of your choice:");
			choice = userinput.nextInt();
			
			switch(choice)
			{
				case 1:	planeX.showNumEmptySeats();
						break;

				case 2:	planeX.showEmptySeats();
					break;
				
				case 3:	planeX.showAssignedSeats(true);
						break;
				
				case 4:	planeX.showAssignedSeats(false);
						break;
				
				case 5:	
						System.out.println("Assigning Seat .. ");
						System.out.print("    Please enter SeatID:");
						seatId = userinput.nextInt();
						System.out.print("    Please enter Customer ID:");
						customerId = userinput.nextInt();
						planeX.assignSeat(seatId, customerId);
						break;
				
				case 6:	System.out.print("    Enter SeatID to unassign customer from:");
						seatId = userinput.nextInt();
						planeX.unAssignSeat(seatId);
						break;
			}
		} while(choice != 7);
		userinput.close();
	}
}
