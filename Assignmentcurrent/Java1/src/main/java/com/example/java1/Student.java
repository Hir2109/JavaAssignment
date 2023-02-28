package com.example.java1;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private List<String> favouriteActivities;
    private String imagePath;

    /**
     * Here this part of code is a constructor as well as get and set method made for all instances that has been made v
     * @param firstName
     * @param lastName
     * @param studentNumber
     */
    public Student(String firstName, String lastName, int studentNumber, List<String> Activities, String imagePath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        favouriteActivities = new ArrayList<>();
        this.imagePath = imagePath;
    }
    public String getFirstName() { // to get the first name
        return firstName;
    }

    //set method for the first name
    public void setFirstName(String firstName) {
        //In order to validate the first name
        if (firstName == null || firstName.trim().length() < 2 || !Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException("Your first name is invalid");
        }
        this.firstName = firstName;
    }

    //get method for the last name
    public String getLastName() {
        return lastName;
    }

    //set method for the last name
    public void setLastName(String lastName) {
        //In order to validate the last name
        if (lastName == null || lastName.trim().length() < 2 || !Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(" Your last name is invalid ");
        }
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    // Set method for the student number
    public void setStudentNumber(int studentNumber) {
        //In order to validate the student number
        if (studentNumber < 010000000 || studentNumber > 999999999) {
            throw new IllegalArgumentException("Invalid student number");
        }
        this.studentNumber = studentNumber;
    }

    //activites list
    public  List<String> getFavouriteActivities() {
        return favouriteActivities;
    }

    public void setFavouriteActivities(List<String> favouriteActivities) {

        this.favouriteActivities = favouriteActivities;
    }

    //method to get students' image
    public Image imagePath() {
        imagePath="Images/"+ firstName + ".jpg";
        return new Image(Student.class.getResourceAsStream(imagePath));
    }

}
