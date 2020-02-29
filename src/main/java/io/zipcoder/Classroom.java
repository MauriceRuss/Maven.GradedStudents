package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
    private Integer maxNumberOfStudents;
    private Student[] students;

    public Classroom(Integer maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = students;

    }

    public Classroom(){
        this.students = new Student [30];
    }
    
    public Student[] getStudent(){
        return students;
    }

    public double getAverageExamScore(){
        Double avgExamScore = 0.0;
        double count = 0;
        for(int i = 0; i < students.length; i++){
            count += students[i].getAverageExamScore();
            avgExamScore = count/students.length;
        }

        return avgExamScore;
    }
}
