package com.example.springdatabasicdemo.init;

import com.example.springdatabasicdemo.dtos.GroupDto;
import com.example.springdatabasicdemo.dtos.StudentDto;
import com.example.springdatabasicdemo.models.Group;
import com.example.springdatabasicdemo.models.Student;
import com.example.springdatabasicdemo.services.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void printAllStudentsByGroupName(String groupName) {
        studentService
                .findStudentsByGroup(groupName)
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        //Добавление в БД записей
        GroupDto g1 = new GroupDto(0,"UVP-211");
        GroupDto g2 = new GroupDto(0,"UVP-212");

        StudentDto s1 = new StudentDto(0, "Petr Ivanov", g1);
        StudentDto s2 = new StudentDto(0, "Ivan Petrov", g2);

        s1 = studentService.register(s1);
        s2 = studentService.register(s2);

        printAllStudentsByGroupName("UVP-212");

        studentService.transfer(s1, s2.getGroup());

        printAllStudentsByGroupName("UVP-212");
    }
}
