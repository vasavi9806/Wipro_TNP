package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.service.StudentReport;

public class TestNullMarksArray {

    @Test
    public void testNullMarks() {

        Student s = new Student("Sekar", null);

        StudentReport sr = new StudentReport();

        assertThrows(NullMarksArrayException.class, () -> {
            sr.validate(s);
        });
    }
}