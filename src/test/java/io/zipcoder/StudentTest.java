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
        Student student= new Student("jay", "spins", new Double[]{4.0, 12.6, 27.5, 8.9});
        Assert.assertTrue(4 == student.getNumberOfExamsTaken());
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
}