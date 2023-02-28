package com.example.java1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {


    @FXML
    private Label activitiesLabel;
    @FXML
    private ListView<String> activitylist;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Button myButton;

    @FXML
    private ImageView myImage;
    @FXML
    private Label studentNumberLabel;

    private List<Student> students = new ArrayList<Student>();

    int buttonClicked =0;
    //methods to change the student information

    @FXML
    void changeStudent(ActionEvent event){
        buttonClicked++;
        if(buttonClicked == 3){
            buttonClicked = 0;
        }

        studentNumberLabel.setText(Integer.toString(students.get(buttonClicked).getStudentNumber())); 
        firstNameLabel.setText(students.get(buttonClicked).getFirstName()); //to change first name
        lastNameLabel.setText(students.get(buttonClicked).getLastName());    //to change last name
        activitiesLabel.setText(students.get(buttonClicked).getFavouriteActivities().toString());
        myImage.setImage(students.get(buttonClicked).imagePath());
        
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Student student1 = new Student("Hir", "Patel", 200524536, Arrays.asList("cooking", "dancing", "singing"), "Images/student1.jpg");
        Student student2 = new Student("Jennifer", "Aniston", 200520838, Arrays.asList("Hiking", "Acting", "Baking"), "Images/student2.jpg");
        Student student3 = new Student("Ian", "Somerhalder", 200543678, Arrays.asList("Decorating", "Clubing", "Reading"), "Images/student3.jpg");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        studentNumberLabel.setText(Integer.toString(students.get(0).getStudentNumber()));
        firstNameLabel.setText(students.get(0).getFirstName());
        lastNameLabel.setText(students.get(0).getFirstName());









    }
}
