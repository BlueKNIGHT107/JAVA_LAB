package q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetConcept 
{
	public static void main(String args[])
	{
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		String suffix;
		for (int i=0; i<5; i++)
		{
			if (i==0)
			{suffix="st";}
			
			else if (i==1)
			{suffix="nd";}
			
			else if(i==2)
			{suffix="rd";}
			
			else
			{suffix="th";}
			
			System.out.println("Enter the name of "+(i+1)+suffix+" student:");
			String name=input.next();
			students.add(new Student(i+1, name));
		}
		
		
		//Copying ArrayList object's elements to a HasSet object
		HashSet<Student> StudentsHashSet = new HashSet<Student>();
		StudentsHashSet.addAll(students);
		Iterator<Student> itr = StudentsHashSet.iterator();
		System.out.println("Values in the HashSet objects:");
		while(itr.hasNext())
		{
			Student s1 = itr.next();
			System.out.println(s1.getID()+":"+s1.getName());
		}
		
		
		
		//Searching user defined object 
		System.out.println("Enter the name of the student to be searched:");
		String name = input.next();

		boolean StudentExists=false;
		itr = StudentsHashSet.iterator();
		while(itr.hasNext())
		{
			Student s1 = itr.next();
			if (s1.getName().equals(name))
			{
				System.out.println("Student found in HashSet.");
				System.out.println(s1.getID()+":"+s1.getName());
				StudentExists=true;
				break;
			}
		}
		
		if(!StudentExists)
		{
			System.out.println("Student not found in the HashSet.");
		}
		
		
		
		//Deleting all the values in the HashSet at one call
		System.out.println();
		System.out.println("Values in HashSet before deletion:"+StudentsHashSet);
		StudentsHashSet.clear();
		System.out.println("Values in HashSet after deletion:"+StudentsHashSet);
		input.close();
	}
}
