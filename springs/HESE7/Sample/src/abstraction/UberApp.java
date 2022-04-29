package abstraction;

import java.util.Scanner;

public class UberApp 
{
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) 
	{
		UberFactory obj = new UberFactory();
		int choice = menu();
		read.nextLine();
		System.out.println("Enter your pick up point: ");
		String src = read.nextLine();
		read.nextLine();
		System.out.println("Enter your drop point: ");
		String des = read.nextLine();
		switch (choice) {
		case 1:
				// using uber factory
				Uber ref = obj.booking("Uber Share");
				double fare = ref.carBooking(src, des);
				System.out.println("Your aprox fare will be: "+ fare);
			break;
		case 2:
		// using uber factory
			Uber re = obj.booking("Uber XL");
			double far = re.carBooking(src, des);
			System.out.println("Your aprox fare will be: "+ far);
			break;
		case 3 : System.exit(choice);
		default:System.out.println("invalid choice");
			break;
		}
	}

	private static int menu() {
		System.out.println("1.UberShare\n2.UberXL\n3.Exit");
		return read.nextInt();
	}
}
