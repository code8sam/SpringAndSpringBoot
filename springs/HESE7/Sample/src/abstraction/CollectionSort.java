package abstraction;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionSort 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(121);
		l.add(2431);
		l.add(1523);
		l.add(152);
		l.add(1536);
		l.add(1253);
		l.add(361);
		l.add(1256);
		System.out.println("Before sorting :\n"+l);
		Comparator<Integer> ref  = (i1, i2) -> {
			return i2 - i1;
		};
		l.sort(ref);
		System.out.println("After sorting :\n"+l);

	}
}
