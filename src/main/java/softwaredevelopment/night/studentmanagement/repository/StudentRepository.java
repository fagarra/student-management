package softwaredevelopment.night.studentmanagement.repository;

import softwaredevelopment.night.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}