package application;


import java.util.ArrayList;
import java.util.List;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;

import javafx.stage.Stage;

public class ButtonController {
	
	Stage applicationStage;
//ADD ALL OBJECTS CREATED HERE
	Studentinfo student = new Studentinfo();
	
	Course SENG300= new Course("SENG300");
	Course CPSC351= new Course("CPSC351");
	Course CPSC331= new Course("CPSC331");
	Course CPSC355= new Course("CPSC355");
	Course MATH213= new Course("MATH213");
	Course MATH277= new Course("MATH277");
	
	Course2 CPSC481= new Course2("CPSC481");
	Course2 CPSC453= new Course2("CPSC453");
	Course2 COMS201= new Course2("COMS201");
	Course2 PSYC200= new Course2("PSYC200");
	Course2 SOCI200= new Course2("SOCI200");
	Course2 MATH313= new Course2("MATH313");
	Course2 CPSC418= new Course2("CPSC418");
	Course2 STAT321= new Course2("STAT321");
	Course2 CPSC411= new Course2("CPSC411");
	Course2 CPSC491= new Course2("CPSC491");
	Course2 CPSC471= new Course2("CPSC471");
	Course2 CPSC441= new Course2("CPSC441");
	
	
	Concentration HumanComputerInteractions= new Concentration("Human Computer Interactions");
	Concentration ComputerGraphics= new Concentration("Computer Graphics");
	Concentration TheoreticalCS= new Concentration("Theoretical Computer Science");
	Concentration ScientificComputation= new Concentration("Scientific Computation");
	Concentration InformationSecurity= new Concentration("Information Security");
	
	
	
    @FXML
    void OpenSlide2(ActionEvent event) {
    	
    	Scene sceneChoose = applicationStage.getScene();
    	Scene select= applicationStage.getScene();
    	Scene completed= applicationStage.getScene();
    	 VBox checkboxes = new VBox();
    	 Label checkboxLabel = new Label("Verify the following to continue ");
    	 CheckBox checkBox1 = new CheckBox("I have completed the recommended 2nd year of computer science courses.");
    	 CheckBox checkBox2 = new CheckBox("I have completed a minimum of 48 units.");
    	 CheckBox checkBox3 = new CheckBox("I understand these recommendations apply to normal circumstances");
    	 CheckBox checkBox4 = new CheckBox("I understand that in case of any exceptional conditions it is best to contact a faculty advisor ");
    	 Button nextButton = new Button("Next");
    	
    	
    	 checkboxes.getChildren().addAll(checkboxLabel,checkBox1,checkBox2,checkBox3,checkBox4,nextButton);
    	 nextButton.setOnAction(doneEvent ->{ if (checkBox1.isSelected()&&checkBox2.isSelected()&&checkBox3.isSelected()&&checkBox4.isSelected()==true) {SelectCompletedCourse(completed);}
    	 else {printSelectAll(select);}});
    	 
    	 Scene scene = new Scene(checkboxes);
    	 applicationStage.setScene(scene);
    	
 
 
    }

	void GetConcentration(Scene sceneChoose) {
		Scene rc = applicationStage.getScene();
		
		VBox vcondition= new VBox();
		Label checkboxLabel = new Label("Choose your desired computer science concentration ");
		HBox c1 = new HBox();
		Button nextButton = new Button("Next");
		
		final ComboBox<String> concentrationComboBox = new ComboBox<String>();
		
        concentrationComboBox.getItems().addAll(
        	HumanComputerInteractions.getConcName(),
            ComputerGraphics.getConcName(),
            TheoreticalCS.getConcName(),
            ScientificComputation.getConcName(),
            InformationSecurity.getConcName()
             
        );
        
      
		
		c1.getChildren().addAll(concentrationComboBox);
		vcondition.getChildren().addAll(checkboxLabel,c1,nextButton);
		nextButton.setOnAction(doneEvent ->{ System.out.println(concentrationComboBox.getValue());AddConcentration( concentrationComboBox.getValue());RecommendedCourses(rc);});
		
		
		Scene conditions = new Scene (vcondition);
		applicationStage.setScene(conditions);
		
	}
	
	


	void printSelectAll(Scene select) {
		VBox message= new VBox();
		Label label1 = new Label("You must meet all conditions to use this application!");
		Button back = new Button("Back");
		 back.setOnAction(doneEvent -> {OpenSlide2(doneEvent);});
		message.getChildren().addAll(label1,back);
		Scene selectAll= new Scene(message);
		applicationStage.setScene(selectAll);
		
	}
	
	public void SelectCompletedCourse(Scene completed) {
		 Scene sceneChoose = applicationStage.getScene();
		 Label label = new Label("Select the courses you have previously completed with a passing grade:");
		 VBox completedcourses= new VBox();
		 CheckBox c1 = new CheckBox("CPSC331");
		 CheckBox c2 = new CheckBox("CPSC351");
    	 CheckBox c3 = new CheckBox("SENG300");
    	 CheckBox c4 = new CheckBox("CPSC355");
    	 CheckBox c5 = new CheckBox("MATH277");
    	 CheckBox c6 = new CheckBox("MATH213");
    	
    	 Button nextButton = new Button("Next");
    	 nextButton.setOnAction(doneEvent -> 
    	 {GetConcentration(sceneChoose);
    	 if (c1.isSelected()) {student.addStudentsCompletedCourse(CPSC331);}
    	 if (c2.isSelected()) {student.addStudentsCompletedCourse(CPSC351);}
    	 if (c4.isSelected()) {student.addStudentsCompletedCourse(SENG300);}
    	 if (c4.isSelected()) {student.addStudentsCompletedCourse(CPSC355);}
    	 if (c5.isSelected()) {student.addStudentsCompletedCourse(MATH277);}
    	 if (c6.isSelected()) {student.addStudentsCompletedCourse(MATH213);}});
    	 
		 completedcourses.getChildren().addAll(label,c1,c2,c3,c4,c5,c6,nextButton);
		 Scene coursesTaken= new Scene(completedcourses);
			applicationStage.setScene(coursesTaken);
		
	}
	 
	private void RecommendedCourses(Scene rc) {
		 Label label= new Label("You need to take the following courses:");
		//String coursestotake=student.
	     //Label list= new Label();
	 VBox recs = new VBox();
		recs.getChildren().addAll(label);
		 Scene reccourses= new Scene(recs);
		applicationStage.setScene(reccourses);
		}
	 void AddConcentration(String selected) {
			//create all concentrations 
		   
			CPSC481.addprereq(SENG300);
			CPSC453.addprereq(CPSC331);CPSC453.addprereq(MATH277);
			HumanComputerInteractions.addrequiredCourses(CPSC453);
			HumanComputerInteractions.addrequiredCourses(CPSC481);
			HumanComputerInteractions.addrequiredCourses(COMS201);
			HumanComputerInteractions.addrequiredCourses(PSYC200);
			HumanComputerInteractions.addrequiredCourses(SOCI200);
			
			
			
			ComputerGraphics.addrequiredCourses(CPSC453);
			
			
			MATH313.addprereq(MATH213);
			
			CPSC418.addprereq(CPSC331);CPSC418.addprereq(CPSC351);
			
			STAT321.addprereq(MATH277);
			
			CPSC411.addprereq(CPSC331);CPSC411.addprereq(CPSC355);
			
			
			TheoreticalCS.addrequiredCourses(CPSC418);
			TheoreticalCS.addrequiredCourses(CPSC411);
			TheoreticalCS.addrequiredCourses(MATH313);
			TheoreticalCS.addrequiredCourses(STAT321);
			
			
			
			CPSC491.addprereq(CPSC331);CPSC491.addprereq(MATH213);
			
			CPSC471.addprereq(CPSC331);
			
			Concentration ScientificComputation= new Concentration("Scientific Computation");
			ScientificComputation.addrequiredCourses(CPSC471);
			ScientificComputation.addrequiredCourses(CPSC491);
			
			
			
			CPSC441.addprereq(CPSC331);CPSC441.addprereq(CPSC355);
            InformationSecurity.addrequiredCourses(CPSC441);
			InformationSecurity.addrequiredCourses(CPSC418);
			System.out.println(selected);
		Concentration[] concentrations= {HumanComputerInteractions,ComputerGraphics,TheoreticalCS,ScientificComputation,InformationSecurity};
			for (int i=0;i<5;i++) {
				if (selected.equals((concentrations[i].getConcName()))) {
					System.out.println(selected);
					System.out.println(concentrations[i].getConcName());
					student.setConcentration(concentrations[i]);
				}
			} 
			 System.out.println(student);
		}
	 
	 

}