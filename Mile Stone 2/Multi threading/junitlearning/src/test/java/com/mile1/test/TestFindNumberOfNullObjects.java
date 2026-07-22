package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class TestFindNumberOfNullObjects {

    @Test
    public void testNullObjects() {

        Student[] data = {
                new Student("A", new int[] {10}),
                null,
                new Student("B", new int[] {20}),
                null
        };

        StudentService ss = new StudentService();

        assertEquals(2, ss.findNumberOfNullObjects(data));
    }
}