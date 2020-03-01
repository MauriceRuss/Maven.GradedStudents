package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private Integer maxNumberOfStudents=30;
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
        for(int i = 0; i < students.size(); i++){
            avgExamScore += students.get(i).getAverageExamScore();
        }
        return avgExamScore/students.size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName) ) {
                studentsToRemove.add(student);
            }
        }
        if (studentsToRemove.size() > 0) {
            students.removeAll(studentsToRemove);
        }
    }

    public List<Student> getStudentsByScore(){
        Collections.sort(students);
        return students;
    }
}
