package softwaredevelopment.night.studentmanagement.service;

import softwaredevelopment.night.studentmanagement.model.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    Student updateStudent(Long id, Student studentDetails);
    void deleteStudent(Long id);
}