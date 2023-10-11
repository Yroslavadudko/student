package org.example;


import java.util.logging.Logger;

public class Student {
    private final int studentId;
    private String firstName;
    private String lastName;
    private static final Logger logger = Logger.getLogger(Student.class.getName());

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void logStudentInfo() {
        String logMessage = String.format("Student ID: %d, Name: %s %s", studentId, firstName, lastName);
        logger.info(logMessage);
    }
}
