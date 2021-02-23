package com.madura.student.dal.studentdal;

import com.madura.student.dal.studentdal.entities.Student;
import com.madura.student.dal.studentdal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentdalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void createStudent() {
        Student student = new Student();
        student.setName("Madura");
        student.setCourse("Higher Diploma");
        student.setFee(30d);
        studentRepository.save(student);
    }

    @Test
    public void testFindStudentById() {
        Optional<Student> student = studentRepository.findById(1l);
        System.out.println(student);
    }

    @Test
    public void testUpdateStudent() {
        Optional<Student> gteStudent = studentRepository.findById(1l);
        Student student = gteStudent.get();
        student.setFee(500d);
        studentRepository.save(student);
    }

    @Test
    public void testDeleteStudent(){
        Student student = new Student();
        student.setId(1l);
        studentRepository.delete( student);
    }
}
