package ru.mentee.power;


import ru.mentee.power.devtools.student.Student;
import ru.mentee.power.devtools.student.StudentList;

import java.util.List;

public class ProgressDemo {
    public static void main(String[] args) {
        MenteeProgress progress = new MenteeProgress("Алена", 2, 6);
        System.out.println(progress.summary());
        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Иван", "Екатеринбург", "Backend", 5, 12),
                new Mentee("Мария", "Москва", "Frontend", 8, 12),
                new Mentee("Петр", "Сочи", "Full-stack", 12, 12)
        };
        StudentList list = new StudentList();
        Student student = new Student("Анна", "Екатеринбург");
        Student student1= new Student("Алена","Екатеринбург"); // инициализируйте поля Student

        list.addStudent(student);
        list.addStudent(student1);

        String trackerProgress = tracker.calculateTotalProgress(mentees);
        System.out.println(trackerProgress);
    }
}
