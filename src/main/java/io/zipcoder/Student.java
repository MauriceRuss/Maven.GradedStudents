package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] examScores;


    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName= lastName;
        this.examScores= examScores;
    }

    public Student(){
        this.firstName = null;
        this.lastName = null;
        this.examScores = null;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }



    public void setFirstName (String firstName){
        this.firstName = firstName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){

        return this.examScores.length;
    }

    public String getExamScores(){
        String scores = "Exam Scores: \n";
        for(int i = 0; i < examScores.length; i++){
            scores  += String.format("Exam %d -> %d \n",i +1 , (int)Math.round(this.examScores[i]) );

        }

        return scores;
    }

    public String addExamScore(double examScore){
        return null;
    }
}
