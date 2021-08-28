package q3;

public class Student 
{
	String name;
	Integer id;
	public Student(Integer StudentID, String StudentName)
	{
		id=StudentID;
		name=StudentName;
	}
	
	public void setName(String NewName)
	{
		name=NewName;
	}
	
	public void setID(Integer NewID)
	{
		id=NewID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Integer getID()
	{
		return id;
	}
}
