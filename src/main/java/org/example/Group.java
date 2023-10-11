package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Group {
    private Student leader;
    private List<Student> studentList;
    private List<String> tasks;
    private static final Logger logger = Logger.getLogger(Group.class.getName());

    Group(Student leader) {
        this.leader = leader;
        this.studentList = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public void removeTask(String task) {
        tasks.remove(task);
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
