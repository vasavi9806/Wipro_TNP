package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class TestFindNumberOfNullName {

    @Test
    public void testNullNames() {

        Student[] data = {
                new Student("A", new int[] {10, 20, 30}),
                new Student(null, new int[] {30, 40, 50}),
                new Student(null, new int[] {50, 60, 70})
        };

        StudentService ss = new StudentService();

        assertEquals(2, ss.findNumberOfNullName(data));
    }
}