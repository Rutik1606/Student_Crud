package com.ezio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezio.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
