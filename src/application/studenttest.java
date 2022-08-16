package application;

import java.util.ArrayList;

public class studenttest {

	public static void main(String[] args) {
		Course SENG300= new Course("SENG300");
		Course CPSC351= new Course("CPSC351");
		Course CPSC331= new Course("CPSC331");
		Course CPSC355= new Course("CPSC355");
		Course MATH213= new Course("MATH213");
		Course MATH277= new Course("MATH277");
		
		Course2 CPSC481= new Course2("CPSC481");
		CPSC481.addprereq(SENG300);
		Course2 CPSC453= new Course2("CPSC453");
		CPSC453.addprereq(CPSC331);CPSC453.addprereq(MATH277);
		Course2 COMS201= new Course2("COMS201");
		Course2 PSYC200= new Course2("PSYC200");
		Course2 SOCI200= new Course2("SOCI200");
		
		
		Concentration HumanComputerInteractions= new Concentration("HumanComputerInteractions");
		HumanComputerInteractions.addrequiredCourses(CPSC453);
		HumanComputerInteractions.addrequiredCourses(CPSC481);
		HumanComputerInteractions.addrequiredCourses(COMS201);
		HumanComputerInteractions.addrequiredCourses(PSYC200);
		HumanComputerInteractions.addrequiredCourses(SOCI200);
		System.out.println(HumanComputerInteractions);
		
		Concentration ComputerGraphics= new Concentration("Computer Graphics");
		ComputerGraphics.addrequiredCourses(CPSC453);
		
		Course2 MATH313= new Course2("MATH313");
		MATH313.addprereq(MATH213);
		Course2 CPSC418= new Course2("CPSC418");
		CPSC418.addprereq(CPSC331);CPSC418.addprereq(CPSC351);
		Course2 STAT321= new Course2("STAT321");
		STAT321.addprereq(MATH277);
		Course2 CPSC411= new Course2("CPSC411");
		CPSC411.addprereq(CPSC331);CPSC411.addprereq(CPSC355);
		
		Concentration TheoreticalCS= new Concentration("Theoretical Computer Science");
		TheoreticalCS.addrequiredCourses(CPSC418);
		TheoreticalCS.addrequiredCourses(CPSC411);
		TheoreticalCS.addrequiredCourses(MATH313);
		TheoreticalCS.addrequiredCourses(STAT321);
		
		
		Course2 CPSC491= new Course2("CPSC491");
		CPSC491.addprereq(CPSC331);CPSC491.addprereq(MATH213);
		Course2 CPSC471= new Course2("CPSC471");
		CPSC471.addprereq(CPSC331);
		
		Concentration ScientificComputation= new Concentration("Scientific Computation");
		ScientificComputation.addrequiredCourses(CPSC471);
		ScientificComputation.addrequiredCourses(CPSC491);
		
		
		Course2 CPSC441= new Course2("CPSC441");
		CPSC441.addprereq(CPSC331);CPSC441.addprereq(CPSC355);

		Concentration InformationSecurity= new Concentration("Information Security");
		InformationSecurity.addrequiredCourses(CPSC441);
		InformationSecurity.addrequiredCourses(CPSC418);

	

	}

}
