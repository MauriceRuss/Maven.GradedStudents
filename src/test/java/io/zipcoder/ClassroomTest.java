package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
//    @Test
//    public void getStudent() {
//        Double[] s1Scores = { 100.0, 150.0 };
//        Double[] s2Scores = { 225.0, 25.0 };
//
//        Student s1 = new Student("student", "one", s1Scores);
//        Student s2 = new Student("student", "two", s2Scores);
//
//        ArrayList<Student> students = new {s1,s2};
//        Classroom classroom = new Classroom(students);
//
//        ArrayList<Student> output  = new ArrayList<>(Arrays.asList(students));
//        ArrayList<Student> actual = classroom.getStudent();
//        Assert.assertEquals(output, actual);
//    }

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



}
