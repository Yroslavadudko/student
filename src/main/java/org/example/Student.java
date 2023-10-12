package org.example;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
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
class Group {
    private Student leader;
    private List<Student> studentList;
    private List<String> tasks;
    private static final Logger logger = Logger.getLogger(Group.class.getName());

    public Group(Student leader) {
        this.leader = leader;
        this.studentList = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.studentList.add(leader);
    }
    public void changeLeader(Student newLeader){
        if (studentList.contains(newLeader)){
            leader = newLeader;
        }else {
            logger.warning("New leader must be a member of the group.");
        }
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(Student student){
        if (student != leader){
            studentList.remove(student);
        }else {
            logger.warning("The leader cannot be removed from the group.");
        }
    }

    public void renameStudent(Student student, String newFirstName, String newLastName){
        if (student != leader){
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
        }else {
            logger.warning("The leader's name cannot be changed this way.");
        }
    }

    public void addTask(String task){
        tasks.add(task);
    }
    public void markTaskAsCompLeader(Student student, String task) {
        if (studentList.contains(student)){
            logger.info("Student: " + student.getFirstName() + " marked task '" + task + "' as comleted.");
        }else {
            logger.warning("Student must be a member of the group to mark a task as completed.");
        }
    }
    public void displayGroupInfo(){
        logger.info("Group Leader: " + leader.getFirstName() + " " + leader.getLastName());
        for (Student student : studentList) {
            student.logStudentInfo();
        }
        for (String task : tasks){
            logger.info("Task: " + task);
        }

    }
}

