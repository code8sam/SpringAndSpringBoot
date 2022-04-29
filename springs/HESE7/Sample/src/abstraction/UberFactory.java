package abstraction;

@FunctionalInterface
interface Uber
{
	double carBooking(String src, String des);
}

public class UberFactory 
{
	public Uber booking(String cab) 
	{
		Uber ref = null;
		if (cab.equals("Uber Share"))
		{
			ref = (src, dest) -> {
				System.out.println("your cab is booked from "+ src + " to " + dest);
				return 310.67; 
				};
		}
		else if (cab.equals("Uber XL"))
		{
			ref = (src, dest) -> {
				System.out.println("your cab is booked from "+ src + " to " + dest);
				return 501.67; 
				};
		}
		return ref;
	}
}
