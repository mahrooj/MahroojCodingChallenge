package application;

import java.util.ArrayList;

public class Student
{
	
	ArrayList<Course>completedCourses;
	String name;
	Concentration concentration;
	ArrayList<Course>selectedCourses;
	
	public boolean isCourseOverlapping(Course course1,Course course2)
	{
		return false;
		
	}
	
    public void addCompletedCourse(Course addCourse)
    {
    	completedCourses.add(addCourse);
    }
    
    //check timings before adding !!incomplete!!
    public void addSelectedCourse(Course addCourse)
    {
    	for (Course chosencourse : selectedCourses)
    	{
    		//if (!addCourse.startTime.after(chosencourse.endTime))&&(!chosencourse.startTime.after(addCourse.endTime))))
    	}
    	selectedCourses.add(addCourse);
    }
    
    public String toString()
    {
		return name+" wants a concentration in " + concentration ;
    	
    }
   
    
}
