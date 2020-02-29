package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getExamScores() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String output = student.getExamScores();
        String expected = "Exam Scores: \nExam 1 -> 100 \nExam 2 -> 95 \nExam 3 -> 123 \nExam 4 -> 96 \n";
        Assert.assertEquals(expected,output);
    }

    @Test
    public void setFirstName() {
       Student student = new Student();
       String expected = "mary";
       student.setFirstName(expected);
       String actual = student.getFirstName();
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        Student student = new Student();
        String expected = "smith";
        student.setLastName(expected);
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTaken() {
        Student student= new Student("jay", "doss", new Double[0]);
        student.addExamScore(100.0);
        Integer expected = 1;
        Integer actual = student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamScores() {
    }

    @Test
    public void addExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);


        student.addExamScore(100.0);
        String output = student.getExamScores();
        String actual = "Exam Scores: \nExam 1 -> 100\n";
        Assert.assertEquals(output, actual);
    }


    @Test
    public void setExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
        String actual = "Exam Scores: \nExam 1 -> 150.0\n";

        Assert.assertEquals(output, actual);

    }

    @Test
    public void getAverageExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        double output = student.getAverageExamScore();
        double actual = 125;

        Assert.assertEquals(output, actual, 0.001);
    }



}