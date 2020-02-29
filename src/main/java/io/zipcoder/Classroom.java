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
    
    public Student[] getStudent(){
        ArrayList<Student> studentList = new ArrayList<>();
        for (Student student: students) {
            if (student != null)
                studentList.add(student);
        }
        return studentList.toArray(new Student[studentList.size()]);

    }

    public double getAverageExamScore(){
        Double avgExamScore = 0.0;
        double count = 0;
        for(int i = 0; i < students.size(); i++){
            Student pupil = students.get(i);
            count += pupil.getNumberOfExamsTaken();
            avgExamScore = (pupil.getAverageExamScore() * pupil.getNumberOfExamsTaken());
        }
        return avgExamScore;
    }

    public void addStudent(Student student){
        students.add(student);
    }



}
