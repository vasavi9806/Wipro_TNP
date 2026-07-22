package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;

public class TestNullStudent {

    @Test
    public void testNullStudent() {

        StudentReport sr = new StudentReport();

        assertThrows(NullStudentException.class, () -> {
            sr.validate(null);
        });
    }
}