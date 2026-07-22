package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class TestFindNumberOfNullMarks {

    @Test
    public void testNullMarks() {

        Student[] data = {
                new Student("A", null),
                new Student("B", new int[] {10}),
                new Student("C", null)
        };

        StudentService ss = new StudentService();

        assertEquals(2, ss.findNumberOfNullMarksArray(data));
    }
}