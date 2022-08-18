package application;

public class Course {

	private String name;
	private boolean coursecompleted;

	public Course() {}
	
	public Course(String n)
	{
		setName(n);
		coursecompleted = false;
	}
	
	
	public String toString() 
	{
		return getName();
	}

	public String getName() {
		return name;
	}
	public boolean isCourseDone() {
		return coursecompleted;
	}

	public void setCourseDone() {
		coursecompleted = true;
	}
	public void setName(String name) {
		if(name!=null)this.name = name;
	}
	
	
	

}
