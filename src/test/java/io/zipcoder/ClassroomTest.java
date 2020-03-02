package io.zipcoder;

import com.sun.tools.javac.util.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);
        Assert.assertTrue(classroom.getStudents().size()== 1);

        classroom.removeStudent("Leon","Hunter");
        Assert.assertTrue(classroom.getStudents().size()== 0);
    }

    @Test
    public void removeStudentFirstNameNoMatch() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);
        Assert.assertTrue(classroom.getStudents().size()== 1);

        classroom.removeStudent("John","Hunter");
        Assert.assertTrue(classroom.getStudents().size()== 1);
    }

    @Test
    public void removeStudentLastNameNoMatch() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);
        Assert.assertTrue(classroom.getStudents().size()== 1);

        classroom.removeStudent("Leon","Russell");
        Assert.assertTrue(classroom.getStudents().size()== 1);
    }

    @Test
    public void removeStudentNullArguments() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);
        Assert.assertTrue(classroom.getStudents().size()== 1);

        classroom.removeStudent(null,null);
        Assert.assertTrue(classroom.getStudents().size()== 1);
    }

    @Test
    public void getStudentsByScoreAHigherThanB() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0 };
        Student studentA = new Student("A", "A", examScores);
        classroom.addStudent(studentA);
        Assert.assertEquals(classroom.getStudents().size(),1);

        Double[] examScores2 = { 50.0 };
        Student studentB = new Student("B", "B", examScores2);
        classroom.addStudent(studentB);
        Assert.assertEquals(classroom.getStudents().size(),2);

        List<Student> studentsByScore = classroom.getStudentsByScore();
        Assert.assertEquals(classroom.getStudents().size(),2);
        Assert.assertEquals(studentsByScore.get(0),studentA);
        Assert.assertEquals(studentsByScore.get(1),studentB);
    }

    @Test
    public void getStudentsByScoreBHigherThanA() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 50.0 };
        Student studentA = new Student("A", "A", examScores);
        classroom.addStudent(studentA);
        Assert.assertEquals(classroom.getStudents().size(),1);

        Double[] examScores2 = { 100.0 };
        Student studentB = new Student("B", "B", examScores2);
        classroom.addStudent(studentB);
        Assert.assertEquals(classroom.getStudents().size(),2);

        List<Student> studentsByScore = classroom.getStudentsByScore();
        Assert.assertEquals(classroom.getStudents().size(),2);
        Assert.assertEquals(studentsByScore.get(0),studentB);
        Assert.assertEquals(studentsByScore.get(1),studentA);
    }

    @Test
    public void getStudentsByScoreEqualScores() {
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0 };
        Student studentA = new Student("A", "A", examScores);
        classroom.addStudent(studentA);
        Assert.assertEquals(classroom.getStudents().size(),1);

        Double[] examScores2 = { 100.0 };
        Student studentB = new Student("B", "B", examScores2);
        classroom.addStudent(studentB);
        Assert.assertEquals(classroom.getStudents().size(),2);

        List<Student> studentsByScore = classroom.getStudentsByScore();
        Assert.assertEquals(classroom.getStudents().size(),2);
        Assert.assertEquals(studentsByScore.get(0),studentA);
        Assert.assertEquals(studentsByScore.get(1),studentB);
    }


    @Test
    public void getGradeBookTest() {
        Double[] student1Grade = new Double[] {100.0, 95.0};
        Double[] student2Grade = new Double[] {62.0, 64.0};
        Double[] student3Grade = new Double[] {70.0, 70.0};
        Double[] student4Grade = new Double[] {15.0, 45.0};
        Double[] student5Grade = new Double[] {80.0, 83.0};
        Student student1 = new Student("Jamie", "Cutrona",student1Grade);
        Student student2 = new Student("Damon", "Betz", student2Grade);
        Student student3 = new Student("Jack", "Monahan", student3Grade);
        Student student4 = new Student("Dan", "Cohoon", student4Grade);
        Student student5 = new Student("Mike", "Edwards", student5Grade);
        Student[] students = {student1, student2, student3, student4, student5};
        Classroom classroom = new Classroom(students);

        Map gradeBook = classroom.getGradeBook();
        Assert.assertEquals(gradeBook.get(student1),"A");
        Assert.assertEquals(gradeBook.get(student2),"D");
        Assert.assertEquals(gradeBook.get(student3),"C");
        Assert.assertEquals(gradeBook.get(student4),"F");
        Assert.assertEquals(gradeBook.get(student5),"B");
    }
}
