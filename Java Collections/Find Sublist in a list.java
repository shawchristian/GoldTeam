//uses indexOfSubList() and lastIndexOfSublist() to check whether the sublist is there in the list or not; and to also find the last occurance of the sublist in the list.  

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//create a list of numbers spelled out
	   List list = Arrays.asList("one Twp three Four five six one three Four".split(""));
	   //print the listed numbers
	   System.out.println("List :"+list);
	   //split list into two 
	   List sublist = Arrays.asList("three Four".split(""));
	   //print the index
	   System.out.println("Sublist :"+sulist);
	   //following checks whether the sublist is there in the list or not.
	   System.out.println("indexOfSublist: " + Collections.indexOfSubList(list, sublist));
	   //finds thelast occurance of the sublist in the list.  
	   System.out.println("lastIndexOfSubList ": + Collections.lastIndexOfSubList(list, sublist));
	}
}