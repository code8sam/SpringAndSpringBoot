
public class Inter 
{
	public static void main(String[] args) {
		
//		TestDemo obj = new TestDemo();
//		obj.m1();
//		obj.m3();
//		Demo.m2();
		String fname = "Virat";
		
		Demo ref = null;
		
		
		ref = (f, l) -> {
			System.out.println(f+ l +" this is from abstarct method");
			return "Bye";
		};
		System.out.println(ref.m1(fname, "Kholi"));
		
		ref.m3();
	}
}
