package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class Studentmain {

    static Student data[] = new Student[8];

    public static void main(String args[]) {

        data[0] = new Student("Carl", new int[] { 77, 71, 82 });
        data[1] = new Student("Steve", new int[] { 57, 36, 46 });
        data[2] = new Student(null, new int[] { 66, 65, 55 });
        data[3] = new Student("Ryan", null);
        data[4] = null;
        data[5] = new Student("Mark", new int[] { 90, 91, 92 });
        data[6] = new Student("John", new int[] { 20, 25, 30 });
        data[7] = new Student("David", new int[] { 65, 60, 70 });

        StudentReport report = new StudentReport();

        for (Student s : data) {

            try {

                if ("VALID".equals(report.validate(s))) {

                    System.out.println(s.getName() + " Grade : "
                            + report.findGrades(s));
                }

            } catch (Exception e) {

                System.out.println(e);

            }
        }

        StudentService service = new StudentService();

        System.out.println("Null Marks : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));

    }
}