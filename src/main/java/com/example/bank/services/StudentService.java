package com.example.bank.services;

import com.example.bank.dtos.GroupDto;
import com.example.bank.dtos.StudentDto;

import java.util.List;
import java.util.Optional;

public interface StudentService<ID> {

    StudentDto register(StudentDto student);

    void expel(StudentDto student);

    void expel(ID id);

    void transfer(StudentDto student, GroupDto group);

    Optional<StudentDto> findStudent(ID id);

    List<StudentDto> getAll();

    List<StudentDto> findStudentsByGroup(String group);
}