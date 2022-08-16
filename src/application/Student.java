package application;

import java.util.ArrayList;

public class Student
{
	
	 private ArrayList<Course>completedCourses;
	 private Concentration concentration;
	private ArrayList<Course>selectedCourses;
	
	public Student(Concentration conc)
	{
		concentration = conc;
		completedCourses = new ArrayList<Course>();
		selectedCourses = new ArrayList<Course>();
	}
	
	public Concentration getconcentration() {
		return concentration;
	}
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
		return " concentration in " + concentration ;
    	
    }
   
    
}
