package ru.mentee.power.devtools.student;
import java.util.List;
import java.util.ArrayList;  // порядок импортов нарушен


// 2. Нарушение: неиспользуемый импорт
//import java.math.BigDecimal;

    public class StudentList {

        private List<Student> studentList = new ArrayList<>();


        public void addStudent(Student student) {
            if (student != null)  // нарушение: нет пробела после if
                studentList.add(student);
        }

        // нарушение: длинная строка (>120 символов)
        public List<Student> getStudentsFromSpecificCity(String city) {
            return studentList.stream().filter(s -> s.city().equals(city)).toList();
        }


    }

