package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept 
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Raman");
		names.add("Laxman");
		names.add("Rajesh");
		names.add("Aayush");
		
		Iterator<String> itr = names.iterator();
		System.out.println("Names of the people in the original ArrayList object are:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//Duplicate copy of the ArrayList names
		ArrayList<String> duplicate = new ArrayList<String>();
		duplicate =  (ArrayList<String>)names.clone();
		
		Collections.reverse(duplicate);
		
		Iterator<String> itr2 = duplicate.iterator();
		System.out.println("Names of the people in the reversed ArrayList object are:");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
