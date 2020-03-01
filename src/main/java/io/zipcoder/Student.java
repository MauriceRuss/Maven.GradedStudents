package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {

    private  String firstName;
    private  String lastName;
    private  ArrayList <Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName= lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
        //this.examScores.addAll(Arrays.asList(testScores));
    }

    public  Student(){}

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
        return this.examScores.size();
    }

    public String getExamScores(){
        //String scores = "Exam Scores: \n";
        //
        //for(int i = 0; i < examScores.size(); i++){
         //   scores  += String.format("Exam %d -> %.1f\n",i +1 , this.examScores.get(i) );
        //}
        StringBuilder builder = new StringBuilder("Exam Scores: \n");
        for(int i = 0; i < examScores.size(); i++){
            builder.append(String.format("Exam %d -> %d \n",i +1 , Math.round(this.examScores.get(i)) ));
        }
        return builder.toString();
    }

    public String addExamScore(double i){
        this.examScores.add(i);
        String aes = "Exam Scores: \nExam 1 -> " + i +"\n";
        return aes;
    }

    public void setExamScore(int examNumber, double newScore){
        this.examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore(){
        Double gaes = 0.0;
        double count = 0;
        for(int i = 0; i < examScores.size(); i++){
            count += examScores.get(i);
            gaes = count/examScores.size();
        }
       return gaes ;
    }

    @Override
    public String toString(){
        return "'''\n" + "Student Name: " + firstName + " " + lastName + "\n" + getExamScores()+ "\n" + getAverageExamScore()+"\n'''";
    }

    @Override
    public int compareTo(Student student) {
        if (student.getAverageExamScore().compareTo(this.getAverageExamScore()) == 0) {
            return this.getLastName().compareTo(student.lastName);
        }
        return (int) Math.round(student.getAverageExamScore()-this.getAverageExamScore());
    }
}
