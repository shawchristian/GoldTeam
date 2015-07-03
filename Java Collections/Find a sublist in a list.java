//uses replaceAll() method to replace all the occurance of an element with a different element in a list

import java.util.*;

public class Main
{
	public static void maing(String[] args)
	{
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :"+list);
		Collections.replaceAll(list, "one", "hundread");
		System.out.println("replaceAll: " + list);
		
	}
}