package application;

import java.util.ArrayList;
import java.util.Date;


public class Course2 extends Course {
	private ArrayList<Course>prerequisites;
	private Date startTime;
	private Date endTime;
	
	//Course2 CPSC481= new Course2();
	public Course2(){
		prerequisites = new ArrayList<Course>();
	}
	
	public Course2(String n) {
		setName(n);
		prerequisites = new ArrayList<Course>();
	}
	
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
	

	public void addprereq(Course i)
	{prerequisites.add(i);}

	public String toString() 
	{
		String w=","+ getName() +/*" is from " + startTime +" to " + endTime+*/ " which requires ";
		String s = "";
		for (Course c : prerequisites)
		 {s+= c+" ";}
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
