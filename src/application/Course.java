package application;
import java.util.ArrayList;
import java.util.Date;


public class Course {
	
	Date startTime;
	Date endTime;
	String name;
	ArrayList<Course>prerequisites;
	
	public String toString() 
	{
		String w= name +" is from " + startTime +" to " + endTime+ " , and requires";
		String s = null;
		for (Course c : prerequisites)
		{s+= c;}
		return w+s;
	}
	
	
	//check if courses are overlapping
		public boolean isCourseOverlapping(Course course1,Course course2)
		{
			return false;
			
		}

}
