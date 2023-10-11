package org.example;

public class Main {
    public static void main(String[] args) {
        Student leader = new Student(1, "Mykola", "Dudko");
        Group group = new Group(leader);

        Student student1 = new Student(2, "Nataly", "Dudka");
        Student student2 = new Student(3, "Yaroslava", "Dudko");

        group.addStudent(student1);
        group.addStudent(student2);

        group.addTask("Homework 1");
        group.addTask("Project Presentation");

        group.displayGroupInfo();
    }
}
