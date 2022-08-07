package application;

import java.util.ArrayList;
//this needs to be stored fixed info, not input, how??
public class Concentration {
	ArrayList<Course>requiredCourses;
	String name;
	
	
	

	
	public String toString() 
	
	{
		 String s = null;
	     String w=  name + " has the following required courses: " ;
	      for (Course c : requiredCourses)
	      { s += " "+ c;} ;
	   
		return w + s; 
	      
	      
	}
	
	
	
	
	
	
}

