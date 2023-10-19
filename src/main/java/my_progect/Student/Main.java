package my_progect.Student;

public class Main {
    public static void main(String[] args) {
        Student leader = new Student( 111023, "Mykola", "Dudko");
        Group group = new Group(leader);

        Student student1 = new Student(101023, "Nataly", "Sherbina");
        Student student2 = new Student(131023, "Yaroslava", "Dudko");
        Student student3 = new Student(121023, "Valery", "Dudko");
        Student student4 = new Student(151023, "Haruka", "Dudko");
        Student student5 = new Student(161023, "Loo loo", "Dudko");
        Student student6 = new Student(171023, "Sergiy", "Sherbina");

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);

        group.addTask("Homework 14"); //adding a task
        group.addTask("Project Presentation");

        group.changeLeader(student2); //change the leader

        group.markTaskAsCompLeader(student4, "Homework 14"); //mark the task as completed
        group.markTaskAsCompLeader(student5, "Project Presentation");

        group.removeStudent(student6); // delete a student

        group.renameStudent(student1, "Natali", "Dudko"); //rename the student

        group.displayGroupInfo();
    }
}

