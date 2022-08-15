package application;

import java.util.ArrayList;

//this needs to be stored fixed info, not input, how??
public class Concentration {
	private ArrayList<Course2>requiredCourses;
	private String name;
	

	public Concentration() {}
	
	public Concentration(String n,ArrayList<Course2>requiredC)
	{
		for (Course2 i: requiredC)
		{
			requiredCourses.add(i);
		}
		name=n;
	}

	
	public void addit(Course2 course)
	{
		requiredCourses.add( course);
	}



	public String toString() 
	{
		 String s = null;
	     String w=  name + " has the following required courses: " ;
	     for (Course c : requiredCourses)
	      { s += " "+ c;};
	     return w + s; 
	}      
		
	public void setConcName(String n)
	{
		name=n;
	}
		
	public String getConcName()
	{
		return name;
	}
	
	public ArrayList<Course2> getRequiredCourses()
	{
		return requiredCourses;
	}
	
	public void setRequiredCourses(ArrayList<Course2> requiredC)
	{
		for (Course2 i: requiredC)
		{
			requiredCourses.add(i);
		}
	}
	      
	
	
	
	
	
	
	
}

