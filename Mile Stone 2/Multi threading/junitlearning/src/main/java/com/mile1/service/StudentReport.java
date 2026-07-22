package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String findGrades(Student studentObject) {

        int marks[] = studentObject.getMarks();

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        int avg = sum / marks.length;

        if (avg < 35)
            return "F";
        else if (avg < 60)
            return "D";
        else if (avg < 80)
            return "B";
        else
            return "A";
    }

    public String validate(Student studentObject)
            throws NullStudentException, NullNameException,
            NullMarksArrayException {

        if (studentObject == null)
            throw new NullStudentException();

        if (studentObject.getName() == null)
            throw new NullNameException();

        if (studentObject.getMarks() == null)
            throw new NullMarksArrayException();

        return "VALID";
    }
}