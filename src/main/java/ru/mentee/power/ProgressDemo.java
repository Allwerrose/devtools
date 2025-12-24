package ru.mentee.power;

import static ru.mentee.power.LiveCodingDemo.findMax;
import static ru.mentee.power.LiveCodingDemo.printFizzBuzz;
import static ru.mentee.power.LiveCodingDemo.sumEven;

import ru.mentee.power.devtools.student.Student;
import ru.mentee.power.devtools.student.StudentList;

/**
 * Запускает методы из классов MenteeProgress,
 * ProgressTracker, StudentList.
 */
public class ProgressDemo {
  /**
   * Запускает методы из классов MenteeProgress,
   * * ProgressTracker, StudentList.
   *
   * @param args аргументы
   */
  public static void main(String[] args) {
    MenteeProgress progress = new MenteeProgress("Алена", 2, 6);
    System.out.println(progress.summary());
    if (progress.readyForSprint()) {
      System.out.println("Status: sprint ready");
    } else {
      System.out.println("Status: backlog first");
    }
    System.out.println();
    ProgressTracker tracker = new ProgressTracker();
    Mentee[] mentees = {
      new Mentee("Иван", "Екатеринбург", "Backend", 5, 12),
      new Mentee("Мария", "Москва", "Frontend", 8, 12),
      new Mentee("Петр", "Сочи", "Full-stack", 12, 12)
    };
    StudentList list = new StudentList();
    Student student = new Student("Анна", "Екатеринбург");
    Student student1 = new Student("Алена", "Екатеринбург");

    list.addStudent(student);
    list.addStudent(student1);

    String trackerProgress = tracker.calculateTotalProgress(mentees);
    System.out.println(trackerProgress);
    System.out.println();
    printFizzBuzz(15);
    System.out.println();
    int[] numbers = {1, 2, 32, 4, 5, 65, 71, 8, 9, 10};
    int[] numbers1 = {};
    sumEven(numbers);
    System.out.println();
    findMax(numbers1);
  }

}
