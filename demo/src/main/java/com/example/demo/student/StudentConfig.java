package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args->{
            Student funda = new Student(
                    "Funda",
                    "funda.ugurlu@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );
            Student oguz = new Student(
                    "Oguz",
                    "Oguz@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(funda,oguz)
            );
        };
    }



}
