package application;

import java.util.ArrayList;

public class Studentinfo
{
	
	 private ArrayList<Course>completedCourses;
	 private Concentration concentration;
	private ArrayList<Course>selectedCourses;
	
	public Studentinfo() {
		completedCourses = new ArrayList<Course>();
		selectedCourses = new ArrayList<Course>();
	}
	public void setConcentration(Concentration ccourse) {
		concentration = ccourse;
	}
	
	public Studentinfo(Concentration conc)
	{
		concentration = conc;
		completedCourses = new ArrayList<Course>();
		selectedCourses = new ArrayList<Course>();
	}
	
	public Concentration getconcentration() {
		return concentration;
	}
	
	public ArrayList<Course> getStudentscompletedCourses(){
		return completedCourses;
	}
	public ArrayList<Course> getselectedCourses(){
		return selectedCourses;
	}
	

	//adds courses student has already completed
    public void addStudentsCompletedCourse(Course addCourse)
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