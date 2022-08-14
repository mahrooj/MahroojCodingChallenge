package application;

public class Course {

	private String name;

	public Course() {}
	
	public Course(String n)
	{
		setName(n);
	}
	
	
	public String toString() 
	{
		return getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null)this.name = name;
	}
	
	
	

}
