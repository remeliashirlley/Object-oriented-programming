package lab3;

public class Plane {
	private PlaneSeat[] seat;
	private int numEmptySeat;
	private static final int numOfSeats = 12;
	
	//constructor
	public Plane()
	{
		this.seat = new PlaneSeat[numOfSeats];
		this.numEmptySeat = numOfSeats;
		for(int i=0; i<numOfSeats; i++) 
			this.seat[i] = new PlaneSeat(i+1);
	}
	
	private PlaneSeat[] sortSeats()
	{
		PlaneSeat[] sortedSeat = new PlaneSeat[12];
		PlaneSeat placeholder;
		
		for(int i=0; i<numOfSeats; i++)
			sortedSeat[i] = seat[i];
		
		for(int i=0; i<numOfSeats-1; i++)
		{
			for(int j=0; j<numOfSeats-i-1; j++)
			{
				if(sortedSeat[j].getCustomerID() > sortedSeat[j+1].getCustomerID())
				{
					placeholder = sortedSeat[j];
					sortedSeat[j] = sortedSeat[j+1];
					sortedSeat[j+1] = placeholder;
				}
			}
		}
		
		return sortedSeat;
	}
	
	public void showNumEmptySeats()
	{	
		System.out.printf("There are %d empty seats\n", this.numEmptySeat);
	}
	
	public void showEmptySeats()
	{
		System.out.println("The following seats are empty:");
		
		for(int i=0; i<numOfSeats; i++)
		{
			if(this.seat[i].isOccupied()!=true)
				System.out.printf("SeatID %d\n", i+1);
		}
	}
	
	public void showAssignedSeats(boolean bySeatId)
	{
		
		PlaneSeat[] PlaneSeatX;
		
		if (bySeatId)
			PlaneSeatX=this.seat;
		else
			PlaneSeatX=sortSeats();
		
		System.out.println("The seat assignments are as follow:");
		for(int i=0; i<numOfSeats; i++)
		{
			if(PlaneSeatX[i].isOccupied())
				System.out.printf("SeatID %d assigned to CustomerID %d.\n", PlaneSeatX[i].getSeatID(), PlaneSeatX[i].getCustomerID());
		}
	}
	
	public void assignSeat(int seatId, int cust_id)
	{
		if(this.seat[seatId-1].isOccupied()==true)
			System.out.println("Seat already assigned to a customer.");
		else
		{
			this.seat[seatId-1].assign(cust_id);
			--this.numEmptySeat;
			System.out.println("Seat Assigned!");
		}
	}
	
	public void unAssignSeat(int seatId)
	{
		if(this.seat[seatId-1].isOccupied()==true)
		{
			this.seat[seatId-1].unAssign();
			++this.numEmptySeat;
		}
		System.out.println("Seat Unassigned!");
	}
}
