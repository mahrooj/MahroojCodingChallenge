package application;

import java.util.ArrayList;

public class CourseObjects {

	public static void main(String[] args) {
		Course CPSC231 = new Course("CPSC231");
		Course CPSC233 = new Course("CPSC233");
		Course CPSC251 = new Course("CPSC251");
	    Course MATH211 = new Course("MATH211");
	    Course MATH249 = new Course("MATH249");
	    Course MATH265 = new Course("MATH265");
	    Course PHIL279 = new Course("PHIL279");
	
	    ArrayList<Course> CGD=new ArrayList<Course>();
		CGD.add(MATH265);
		System.out.println(CGD);
	}

}
