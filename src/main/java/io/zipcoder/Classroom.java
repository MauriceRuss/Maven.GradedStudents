package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    private Integer maxNumberOfStudents;
    private ArrayList<Student> students = new ArrayList<>();



    public Classroom(Integer maxNumberOfStudents){

        this.students = new ArrayList<>(maxNumberOfStudents);
    }

    public Classroom(Student[] students){
        this.students.addAll(Arrays.asList(students));

    }

    public Classroom(){

        this.students = new ArrayList<>(30);
    }
    
    public ArrayList<Student> getStudents(){

        return this.students;

    }

    public double getAverageExamScore(){
        Double avgExamScore = 0.0;
        int classSize = students.size();
        for(int i = 0; i < students.size(); i++){
            avgExamScore += students.get(i).getAverageExamScore();

        }
        return avgExamScore/classSize;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){

    }

    public void getStudentsByScore(){

    }
}
