package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TestValidate {

    @Test
    public void testValidate() throws Exception {

        Student s = new Student("Sekar", new int[] {85, 75, 95});

        StudentReport sr = new StudentReport();

        assertEquals("VALID", sr.validate(s));
    }
}