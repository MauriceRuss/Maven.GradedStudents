package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {


    @Test
    public void getAverageExamScore() {
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);
        double output = classroom.getAverageExamScore();
        double actual = 125.0;
        Assert.assertEquals(output, actual, 0.001);
    }


    @Test
    public void addStudent() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        classroom.addStudent(student);


       Assert.assertTrue(classroom.getStudents().size()== 1);
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentsByScore() {
    }
}
