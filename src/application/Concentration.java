package application;

import java.util.ArrayList;
//this needs to be stored fixed info, not input, how??
public class Concentration {
	ArrayList<Course2>requiredCourses;
	String name;
	
	
	Concentration computerGameDevelopment =new Concentration();
  
	
	public Concentration() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Concentration(String n,ArrayList<Course2>requiredC)
	{
		requiredCourses= requiredC;
		name=n;
	}


	public String toString() 
	
	{
		 String s = null;
	     String w=  name + " has the following required courses: " ;
	      for (Course c : requiredCourses)
	      { s += " "+ c;} ;
	   
		return w + s; 
	      
	      
	}
	
	
	
	
	
	
}

