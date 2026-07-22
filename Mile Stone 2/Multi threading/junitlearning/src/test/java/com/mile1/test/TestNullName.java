package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullNameException;
import com.mile1.service.StudentReport;

public class TestNullName {

    @Test
    public void testNullName() {

        Student s = new Student(null, new int[] {80, 70, 90});

        StudentReport sr = new StudentReport();

        assertThrows(NullNameException.class, () -> {
            sr.validate(s);
        });
    }
}