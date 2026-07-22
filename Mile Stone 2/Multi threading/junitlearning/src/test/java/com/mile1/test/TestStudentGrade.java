package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestStudentGrade {

    @Test
    public void testGradeA() {

        Student s = new Student("Sekar", new int[] {85, 75, 95});
        StudentReport sr = new StudentReport();

        assertEquals("A", sr.findGrades(s));
    }

    @Test
    public void testGradeD() {

        Student s = new Student("Ravi", new int[] {40, 45, 50});
        StudentReport sr = new StudentReport();

        assertEquals("D", sr.findGrades(s));
    }

    @Test
    public void testGradeF() {

        Student s = new Student("John", new int[] {10, 20, 30});
        StudentReport sr = new StudentReport();

        assertEquals("F", sr.findGrades(s));
    }
}