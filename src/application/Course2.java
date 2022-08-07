package application;

import java.util.ArrayList;
import java.util.Date;


public class Course2 extends Course{
	ArrayList<Course>prerequisites;
	Date startTime;
	Date endTime;
	
	
	public Course2(){}
	
	public Course2(Date sTime, Date eTime, String n)
	{
		startTime = sTime;
		endTime = eTime;
		name = n;
	}
	
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
