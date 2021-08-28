package q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapConcept 
{
	//@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Aayush");
		map1.put(2, "Ram");
		map1.put(3, "Raman");
		map1.put(4, "Laxman");
		map1.put(5, "Rajesh");
		
		Set<Integer> map1keys=map1.keySet();
		Iterator<Integer> itr = map1keys.iterator();
		
		System.out.println("Keys and values in the HashMap are:");
		while(itr.hasNext())
		{
			int temp = itr.next();
			System.out.println("Key:"+temp+" Value:"+map1.get(temp));
		}
		System.out.println();
		
		

		
		//Checking if the specified key exists or not
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the key to be checked:");
		Integer key = input.nextInt();
		boolean keyPresent = map1.containsKey(key);
		if(keyPresent)
		{
			System.out.println("The value of the key "+key+" is:"+map1.get(key));
		}
		else
		{
			System.out.println("Key "+key+" not present in the HashMap");
		}
		System.out.println();
		
		
		//Checking if the specified value exists or not
		System.out.print("Enter the value to be checked:");
		String value = input.next();
		boolean valuePresent = map1.containsValue(value);
		if(valuePresent)
		{
			itr = map1keys.iterator();
			while(itr.hasNext())
			{
				int temp = itr.next();
				if(map1.get(temp).equals(value))
				{
					System.out.println("Key:"+temp+" Value:"+map1.get(temp));
					break;
				}
			}
		}
		else
		{
			System.out.println("Value "+value+" not present in the HashMap");
		}
		input.close();
		System.out.println();
		
		
		
		//Set of keys of the HashMap
		Set<Integer> keys = map1.keySet();
		System.out.println("Set of keys of the HashMap is "+keys);
		System.out.println();
		
		
		//Key value pair as entry objects
		Set<Map.Entry<Integer, String>> map1EntrySet = (Set<Entry<Integer, String>>)map1.entrySet();
		Iterator<Map.Entry<Integer, String>> itr1 = map1EntrySet.iterator();
		System.out.println("Printing the entry set key-value pairs:");
		while (itr1.hasNext()) 
		{
		    System.out.println(itr1.next());
		}
	}
}
