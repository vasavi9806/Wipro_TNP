package com.mile1.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        TestStudentGrade.class,
        TestValidate.class,
        TestNullStudent.class,
        TestNullName.class,
        TestNullMarksArray.class,
        TestFindNumberOfNullName.class,
        TestFindNumberOfNullObjects.class,
        TestFindNumberOfNullMarks.class
})
public class AllTests {

}