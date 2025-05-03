package dev.tbvrln.student.studentInfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student erlan= new  Student(
                    "Erlan", "irlanaytbaev@gmail.com",
                    LocalDate.of(2003, OCTOBER, 22));

            Student alex= new  Student(
                    "Alex", "alex@gmail.com",
                    LocalDate.of(2004, OCTOBER, 21));

            repository.saveAll(
                    List.of(erlan, alex)
            );
        };



    }
}
