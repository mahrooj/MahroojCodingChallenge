package application;

import java.util.ArrayList;

public class Student
{
	
	ArrayList<Course>completedCourses;
	String name;
	Concentration concentration;
	ArrayList<Course>selectedCourses;
	
	
	
	//adds courses student has already completed
    public void addCompletedCourse(Course addCourse)
    {
    	completedCourses.add(addCourse);
    }
    
    //adds new course after checking if any overlaps
    public void addtoSelectedCourse(Course addCourse, ArrayList<Course> selectedCourses)
    {
    	for (Course chosencourse : selectedCourses)
    	{
    		//if (!addCourse.startTime.after(chosencourse.endTime))&&(!chosencourse.startTime.after(addCourse.endTime))))
    		{
    			
    		}
    	}
    	selectedCourses.add(addCourse);
    }
    
    public String toString()
    {
		return name+" wants a concentration in " + concentration ;
    	
    }
   
    
}
