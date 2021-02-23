package com.madura.student.dal.studentdal.repos;

import com.madura.student.dal.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
