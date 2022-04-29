
@FunctionalInterface
public interface Demo 
{
	int i = 10, u=23,l=45;
	String m1(String fname, String lname);
	//int m4();
	static void m2()
	{
		System.out.println("from static method");
	}
	default void m3()
	{
		System.out.println("from non static mehtod");
	}
}
