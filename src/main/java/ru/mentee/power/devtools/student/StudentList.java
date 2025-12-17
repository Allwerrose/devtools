package ru.mentee.power.devtools.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Добавляет студента в список, сортирует по городу.
 */

public class StudentList {

  private final List<Student> studentList = new ArrayList<>();

  /**
   * Добавляет студента в список, исключает пустые строки.
   *
   * @param student Объект студент.
   */
  public void addStudent(Student student) {
    if (student != null) {
      studentList.add(student);
    }
  }

  /**
   * Сортирует студентов по названию города.
   *
   * @param city Информация о городе студента.
   * @return список студентов из одного города
   */
  public List<Student> getStudentsFromSpecificCity(String city) {
    return studentList.stream()
            .filter(s -> s.city()
                    .equals(city)).toList();
  }

}

