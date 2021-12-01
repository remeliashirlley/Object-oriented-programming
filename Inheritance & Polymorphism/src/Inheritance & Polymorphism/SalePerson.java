package lab4;

public class SalePerson implements Comparable<Object>{
	
	private String firstName, lastName;
	private int totalSales;
	
	//constructors
	public SalePerson(String firstName, String lastName, int totalSales)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString()
	{
		return lastName + "," + firstName + ": " + totalSales;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof SalePerson)
		{
			SalePerson salepersonX = (SalePerson) o;
			if(firstName == salepersonX.getFirstName() && lastName == salepersonX.getLastName())
				return true;
		}
		return false;
	}

	public int compareTo(Object o)
	{
		if(o instanceof SalePerson)
		{
			SalePerson salepersonX = (SalePerson) o;
			if((totalSales - salepersonX.getTotalSales()) == 0)
				return salepersonX.getLastName().compareTo(lastName);
			else
				return totalSales - salepersonX.getTotalSales();
		}
		return -1;
	}
	
	//getters
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getTotalSales()
	{
		return this.totalSales;
	}
}
