package ru.mentee.power.devtools.student;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StudentListTest {


    @Test
    void studentRecord_shouldHaveCorrectComponents() {
        Student student = new Student("Анна", "Екатеринбург");
        assertEquals("Анна", student.name());
        assertEquals("Екатеринбург", student.city());
    }

    @Test
    void addStudent_withNullStudent_ShouldNotAdd() {
        StudentList studentList = new StudentList();
        studentList.addStudent(null);
        List<Student> result = studentList.getStudentsFromSpecificCity("Екатеринбург");
        assertEquals(0, result.size());
    }

    @Test
    void studentRecord_equalityTest() {
        Student student1 = new Student("Анна", "Екатеринбург");
        Student student2 = new Student("Анна", "Екатеринбург");
        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    @Test
    void addStudent_andThenGetStudentsFromSpecificCity_ShouldWorkCorrectly() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("Анна", "Екатеринбург");
        Student student2 = new Student("Алена", "Екатеринбург");
        Student student3 = new Student("Иван", "Москва");

        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);

        List<Student> ekbStudents = studentList.getStudentsFromSpecificCity("Екатеринбург");
        List<Student> moscowStudents = studentList.getStudentsFromSpecificCity("Москва");

        assertEquals(2, ekbStudents.size());
        assertEquals(1, moscowStudents.size());
        assertTrue(ekbStudents.contains(student1));
        assertTrue(ekbStudents.contains(student2));
        assertTrue(moscowStudents.contains(student3));
    }

    @Test
    void addStudent_whenStudentAlreadyExists_ShouldAddDuplicate() {
        StudentList studentList = new StudentList();
        Student student = new Student("Анна", "Екатеринбург");

        studentList.addStudent(student);
        studentList.addStudent(student);

        List<Student> result = studentList.getStudentsFromSpecificCity("Екатеринбург");
        assertEquals(2, result.size());
    }

    @Test
    void getStudentsFromSpecificCity_whenStudentHasNullCity_ShouldThrowNPE() {

        StudentList studentList = new StudentList();
        Student studentWithNullCity = new Student("Бездомный", null);
        studentList.addStudent(studentWithNullCity);

        assertThrows(NullPointerException.class, () -> {
            studentList.getStudentsFromSpecificCity("Екатеринбург");
        });
    }
}