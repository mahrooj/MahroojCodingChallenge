package application;

import java.util.ArrayList;
import java.util.Date;


public class Course2 extends Course {
	private ArrayList<Course>prerequisites;
	private Date startTime;
	private Date endTime;
	
	
	public Course2(){}
	
	public Course2(Date sTime, Date eTime, String n, ArrayList<Course>prereq)
	{
		startTime = sTime;
		endTime = eTime;
		setName(n);
		for (Course i: prereq)
		{
			prerequisites.add(i);
		}
	}
	
	public String toString() 
	{
		String w= getName() +" is from " + startTime +" to " + endTime+ " , and requires";
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
	
	public Date getStartTime()
	{
		return startTime;
	}
	
	public Date getEndTime()
	{
		return endTime;
	}
	
	public void setStartTime(Date sTime)
	{
		startTime=sTime;
	}
	public void setEndTime(Date eTime)
	{
		endTime=eTime;
	}
	
	public ArrayList<Course> getPrerequisites()
	{return prerequisites;}
	
	public void setPrerequisites(ArrayList<Course> prereq)
	{
		for (Course i: prereq)
		{
			prerequisites.add(i);
		}
	
	}
}
